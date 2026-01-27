package org.apache.bookkeeper;

import static org.junit.jupiter.api.Assertions.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCountUtil;
import org.apache.bookkeeper.bookie.storage.ldb.ReadCache;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ReadCacheTest {

    private ReadCache cache;

    private ReadCache newCacheWithTwoSmallSegments() {
        // maxCacheSize small + maxSegmentSize large -> segmentsCount = 2, segmentSize = maxCacheSize/2
        // Example: 128/2 => 64 bytes per segment
        ByteBufAllocator allocator = ByteBufAllocator.DEFAULT;
        return new ReadCache(allocator, 128, 1024);
    }

    @AfterEach
    void tearDown() {
        if (cache != null) {
            cache.close();
            cache = null;
        }
    }

    @Test
    void getReturnsNullWhenEntryIsAbsent() {
        cache = newCacheWithTwoSmallSegments();

        assertNull(cache.get(1L, 1L));
        assertFalse(cache.hasEntry(1L, 1L));
        assertEquals(0, cache.count());
        assertEquals(0, cache.size());
    }

    @Test
    void putThenGetReturnsSameContent() {
        cache = newCacheWithTwoSmallSegments();

        long ledgerId = 10L;
        long entryId = 20L;
        byte[] payload = "hello-readcache".getBytes();

        ByteBuf entry = Unpooled.wrappedBuffer(payload);
        try {
            cache.put(ledgerId, entryId, entry);
        } finally {
            // wrappedBuffer is not ref-counted in a way that needs release here,
            // but keep the pattern consistent if this changes.
            ReferenceCountUtil.release(entry);
        }

        assertTrue(cache.hasEntry(ledgerId, entryId));
        assertEquals(1, cache.count());
        assertTrue(cache.size() > 0);

        ByteBuf res = cache.get(ledgerId, entryId);
        assertNotNull(res);
        try {
            byte[] out = new byte[res.readableBytes()];
            res.readBytes(out);
            assertArrayEquals(payload, out);
        } finally {
            ReferenceCountUtil.release(res);
        }
    }

    @Test
    void putWithEntryBiggerThanSegmentIsIgnored() {
        cache = newCacheWithTwoSmallSegments();

        // segmentSize is 64 with our parameters, so make payload > 64
        byte[] bigPayload = new byte[80];
        for (int i = 0; i < bigPayload.length; i++) {
            bigPayload[i] = (byte) (i % 127);
        }

        ByteBuf entry = Unpooled.wrappedBuffer(bigPayload);
        try {
            cache.put(1L, 1L, entry);
        } finally {
            ReferenceCountUtil.release(entry);
        }

        assertFalse(cache.hasEntry(1L, 1L), "Entry should be ignored when bigger than segmentSize");
        assertNull(cache.get(1L, 1L));
        assertEquals(0, cache.count());
        assertEquals(0, cache.size());
    }

    @Test
    void rolloverEventuallyEvictsOldEntries() {
        cache = newCacheWithTwoSmallSegments();

        // With segmentSize=64, insert multiple entries to force rollover and segment recycling.
        // We keep payloads small but aligned to 64 internally; put uses align64(entrySize).
        // Using entrySize=40 -> align64=64. Each insert consumes a full segment slot.
        byte[] payloadA = new byte[40];
        byte[] payloadB = new byte[40];
        byte[] payloadC = new byte[40];

        payloadA[0] = 1;
        payloadB[0] = 2;
        payloadC[0] = 3;

        putBytes(1L, 1L, payloadA); // goes into segment 0
        putBytes(1L, 2L, payloadB); // forces rollover to segment 1
        putBytes(1L, 3L, payloadC); // forces rollover to segment 0 again, clearing it

        // After third put, segment 0 has been cleared and reused, so the first entry should be gone.
        assertFalse(cache.hasEntry(1L, 1L), "Old entry should be evicted after segment reuse");
        assertNull(cache.get(1L, 1L));

        // The more recent entries should still be present (depending on which segment got cleared).
        assertTrue(cache.hasEntry(1L, 2L));
        assertNotNull(cache.get(1L, 2L));
        assertTrue(cache.hasEntry(1L, 3L));
        assertNotNull(cache.get(1L, 3L));
    }

    private void putBytes(long ledgerId, long entryId, byte[] payload) {
        ByteBuf entry = Unpooled.wrappedBuffer(payload);
        try {
            cache.put(ledgerId, entryId, entry);
        } finally {
            ReferenceCountUtil.release(entry);
        }
    }

    @Test
    void hasEntryIsFalseForDifferentKeys() {
        cache = newCacheWithTwoSmallSegments();

        byte[] payload = "value".getBytes();
        putBytes(10L, 20L, payload);

        assertTrue(cache.hasEntry(10L, 20L));
        assertFalse(cache.hasEntry(10L, 21L), "Same ledgerId but different entryId must be absent");
        assertFalse(cache.hasEntry(11L, 20L), "Different ledgerId but same entryId must be absent");
    }

    @Test
    void putOnSameKeyOverwritesValueReturnedByGet() {
        cache = newCacheWithTwoSmallSegments();

        long ledgerId = 1L;
        long entryId = 1L;

        byte[] first = "first".getBytes();
        byte[] second = "second".getBytes();

        putBytes(ledgerId, entryId, first);
        putBytes(ledgerId, entryId, second);

        ByteBuf res = cache.get(ledgerId, entryId);
        assertNotNull(res);
        try {
            byte[] out = new byte[res.readableBytes()];
            res.readBytes(out);
            assertArrayEquals(second, out, "Expected latest value to be returned for same key");
        } finally {
            ReferenceCountUtil.release(res);
        }
    }

}
