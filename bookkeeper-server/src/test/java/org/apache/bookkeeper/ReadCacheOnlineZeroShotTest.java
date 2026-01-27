package org.apache.bookkeeper;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.apache.bookkeeper.bookie.storage.ldb.ReadCache;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReadCacheOnlineZeroShotTest {

    private ReadCache cache;

    @AfterEach
    void tearDown() {
        if (cache != null) {
            cache.close();
        }
    }

    /**
     * 1) get on empty cache returns null and hasEntry is false
     */
    @Test
    void testGetOnEmptyCache() {
        cache = new ReadCache(ByteBufAllocator.DEFAULT, 1024);

        assertNull(cache.get(1L, 1L));
        assertFalse(cache.hasEntry(1L, 1L));
        assertEquals(0, cache.size());
        assertEquals(0, cache.count());
    }

    /**
     * 2) put then get returns same bytes
     */
    @Test
    void testPutThenGetReturnsSameBytes() {
        cache = new ReadCache(ByteBufAllocator.DEFAULT, 1024);

        byte[] data = new byte[]{1, 2, 3, 4};
        ByteBuf entry = Unpooled.wrappedBuffer(data);

        cache.put(10L, 20L, entry);

        // get returns a retained slice; must release
        ByteBuf read = cache.get(10L, 20L);
        assertNotNull(read);

        byte[] readBytes = new byte[read.readableBytes()];
        read.readBytes(readBytes);
        assertArrayEquals(data, readBytes);

        read.release();
        entry.release();
    }

    /**
     * 3) hasEntry is true after put
     */
    @Test
    void testHasEntryAfterPut() {
        cache = new ReadCache(ByteBufAllocator.DEFAULT, 1024);

        ByteBuf entry = Unpooled.wrappedBuffer(new byte[]{9});
        cache.put(5L, 6L, entry);

        assertTrue(cache.hasEntry(5L, 6L));
        entry.release();
    }

    /**
     * 4) oversize entry is ignored (put should not insert)
     */
    @Test
    void testOversizeEntryIgnored() {
        long maxCacheSize = 16; // very small
        cache = new ReadCache(ByteBufAllocator.DEFAULT, maxCacheSize);

        byte[] big = new byte[64];
        ByteBuf bigEntry = Unpooled.wrappedBuffer(big);

        cache.put(1L, 1L, bigEntry);

        assertFalse(cache.hasEntry(1L, 1L));
        assertNull(cache.get(1L, 1L));
        assertEquals(0, cache.count());
        assertEquals(0, cache.size());

        bigEntry.release();
    }

    /**
     * 5) count increases after inserts
     */
    @Test
    void testCountIncreasesAfterInserts() {
        cache = new ReadCache(ByteBufAllocator.DEFAULT, 1024);

        ByteBuf e1 = Unpooled.wrappedBuffer(new byte[]{1});
        ByteBuf e2 = Unpooled.wrappedBuffer(new byte[]{2});

        cache.put(1L, 1L, e1);
        cache.put(2L, 2L, e2);

        assertEquals(2, cache.count());

        e1.release();
        e2.release();
    }
}
