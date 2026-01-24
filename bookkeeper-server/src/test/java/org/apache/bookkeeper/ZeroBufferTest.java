package org.apache.bookkeeper;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.apache.bookkeeper.util.ZeroBuffer;
import org.junit.jupiter.api.Test;

class ZeroBufferTest {

    @Test
    void putFillsRemainingWithZeros() {
        ByteBuffer dst = ByteBuffer.allocate(16);
        dst.position(4); // remaining = 12

        ZeroBuffer.put(dst);

        // After put(dst), position should be at limit
        assertEquals(16, dst.position());

        // Verify that bytes written are zero
        dst.flip(); // position=0, limit=16
        // first 4 bytes were untouched but still zero in a fresh buffer; check all are zero
        while (dst.hasRemaining()) {
            assertEquals(0, dst.get());
        }
    }

    @Test
    void putWithZeroLengthDoesNotChangePosition() {
        ByteBuffer dst = ByteBuffer.allocate(8);
        dst.position(3);

        ZeroBuffer.put(dst, 0);

        assertEquals(3, dst.position(), "Position should not change when length is 0");
    }

    @Test
    void putThrowsBufferOverflowWhenLengthExceedsRemaining() {
        ByteBuffer dst = ByteBuffer.allocate(8);
        dst.position(6); // remaining = 2

        assertThrows(java.nio.BufferOverflowException.class,
                () -> ZeroBuffer.put(dst, 3));
    }

    @Test
    void readOnlyBufferReturnsReadOnlyAndZeroFilled() {
        int length = 100;
        ByteBuffer ro = ZeroBuffer.readOnlyBuffer(length);

        assertTrue(ro.isReadOnly(), "Buffer must be read-only");
        assertEquals(length, ro.remaining());

        // Verify all bytes are zero
        while (ro.hasRemaining()) {
            assertEquals(0, ro.get());
        }

        // Verify it cannot be modified
        ByteBuffer ro2 = ZeroBuffer.readOnlyBuffer(1);
        assertThrows(ReadOnlyBufferException.class, () -> ro2.put((byte) 1));
    }

    @Test
    void readOnlyBufferHandlesLengthGreaterThanInternalChunk() {
        int length = 100_000; // > 64KB
        ByteBuffer ro = ZeroBuffer.readOnlyBuffer(length);

        assertTrue(ro.isReadOnly());
        assertEquals(length, ro.remaining());

        // Spot-check a few positions without iterating 100k (keeps test fast)
        assertEquals(0, ro.get(0));
        assertEquals(0, ro.get(length / 2));
        assertEquals(0, ro.get(length - 1));
    }
}
