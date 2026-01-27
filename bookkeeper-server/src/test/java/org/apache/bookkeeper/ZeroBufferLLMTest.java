package org.apache.bookkeeper;

import java.nio.ByteBuffer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.nio.BufferOverflowException;

public class ZeroBufferLLMTest {
  @Test
  public void testZeroBuffer_put() {
ByteBuffer dst = ByteBuffer.allocate(10);

    // length > remaining -> BufferOverflowException
    Assertions.assertThrows(BufferOverflowException.class,
        () -> org.apache.bookkeeper.util.ZeroBuffer.put(dst, 20));

    // length == remaining -> ok, consumes all remaining bytes
    org.apache.bookkeeper.util.ZeroBuffer.put(dst, 10);
    Assertions.assertEquals(0, dst.remaining());

    // length == 0 -> no-op (position unchanged)
    int posBefore = dst.position();
    org.apache.bookkeeper.util.ZeroBuffer.put(dst, 0);
    Assertions.assertEquals(posBefore, dst.position());
  }
  
  @Test
  public void testZeroBuffer_readOnlyBuffer() {
    int length = 10;
    
    ByteBuffer readOnlyBuffer = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(length);
    Assertions.assertEquals(length, readOnlyBuffer.remaining());
    
    // length = 0 is valid and should return an empty read-only buffer
    ByteBuffer empty = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(0);
    Assertions.assertTrue(empty.isReadOnly());
    Assertions.assertEquals(0, empty.remaining());

    // negative length is invalid (exact exception type depends on implementation)
    Assertions.assertThrows(RuntimeException.class,
        () -> org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(-1));
  }
}
