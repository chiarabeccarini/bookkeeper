package org.apache.bookkeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.remaining()\" because \"dst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.bookkeeper.util.ZeroBuffer zeroBuffer0 = new org.apache.bookkeeper.util.ZeroBuffer();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.nio.ByteBuffer byteBuffer0 = null;
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer0, (int) (short) -1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.put(byte[], int, int)\" because \"dst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.nio.ByteBuffer byteBuffer0 = null;
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer0, (int) (short) 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.size();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = readCache3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.put(byte[], int, int)\" because \"dst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.nio.ByteBuffer byteBuffer0 = null;
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer0, (int) (byte) -1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry(0L, (long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (short) 100, 1L, byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) ' ', (long) (byte) -1, byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        long long8 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put(100L, (long) 100, byteBuf11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        long long5 = readCache3.count();
        readCache3.close();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        long long8 = readCache3.size();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put(10L, (long) '4', byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        long long5 = readCache3.count();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = readCache3.get((long) (short) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        java.lang.Class<?> wildcardClass3 = readCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        io.netty.buffer.ByteBuf byteBuf5 = readCache2.get((long) 0, (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = readCache2.get((long) (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, 1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        long long8 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf11 = readCache3.get((long) (byte) 0, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        readCache3.close();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) ' ', (long) (short) 0, byteBuf8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 'a');
        boolean boolean5 = readCache2.hasEntry((long) (byte) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        readCache3.close();
        java.lang.Class<?> wildcardClass5 = readCache3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put((long) (short) -1, 0L, byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        long long3 = readCache2.count();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put((long) '#', (long) 10, byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry(0L, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = readCache3.get((-1L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, 0);
        java.lang.Class<?> wildcardClass4 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        readCache3.close();
        readCache3.close();
        java.lang.Class<?> wildcardClass7 = readCache3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        long long5 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (-1), (-1L), byteBuf8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put(0L, (-1L), byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = readCache3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry((long) (short) 0, (-1L));
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (short) 1, (long) ' ', byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        long long4 = readCache3.size();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get(10L, (long) '#');
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put(0L, (long) (short) 10, byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(0);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 1, (-1));
        readCache3.close();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (byte) 0, (long) 0, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 0);
        java.lang.Class<?> wildcardClass3 = readCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry(0L, (long) (byte) 0);
        long long11 = readCache3.size();
        readCache3.close();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        boolean boolean6 = readCache3.hasEntry((long) 'a', (long) '4');
        readCache3.close();
        java.lang.Class<?> wildcardClass8 = readCache3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry((long) ' ', 100L);
        long long11 = readCache3.count();
        long long12 = readCache3.size();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        readCache3.close();
        readCache3.close();
        readCache3.close();
        boolean boolean10 = readCache3.hasEntry((long) 0, (-1L));
        java.lang.Class<?> wildcardClass11 = readCache3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        long long3 = readCache2.count();
        boolean boolean6 = readCache2.hasEntry((long) (short) 100, (long) 1);
        long long7 = readCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = readCache2.get((long) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = readCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry((long) (short) 0, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = readCache3.hasEntry((long) (short) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) ' ', (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = readCache3.get((long) (byte) 1, (long) 1);
        long long11 = readCache3.size();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        long long4 = readCache3.size();
        boolean boolean7 = readCache3.hasEntry((long) 0, 1L);
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (byte) 100, (long) (-1), byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1, (-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry(0L, (long) (byte) 0);
        long long11 = readCache3.size();
        long long12 = readCache3.count();
        java.lang.Class<?> wildcardClass13 = readCache3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        readCache3.close();
        readCache3.close();
        readCache3.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = readCache3.hasEntry((long) (short) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        long long4 = readCache3.size();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get(10L, (long) '#');
        io.netty.buffer.ByteBuf byteBuf10 = readCache3.get((long) (short) 10, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = readCache3.hasEntry((long) (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertNull(byteBuf10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        long long3 = readCache2.count();
        boolean boolean6 = readCache2.hasEntry((long) (short) 100, (long) 1);
        long long7 = readCache2.count();
        readCache2.close();
        readCache2.close();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put((long) (short) 10, (long) (short) -1, byteBuf12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 'a');
        long long3 = readCache2.size();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (short) 1, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (short) 10, (long) (byte) 0, byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        readCache2.close();
        long long4 = readCache2.count();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) ' ', (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = readCache3.get((long) (byte) 1, (long) 1);
        boolean boolean13 = readCache3.hasEntry((long) (short) 1, (long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf16 = readCache3.get((long) (byte) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(0);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 1, 1);
        io.netty.buffer.ByteBuf byteBuf6 = readCache3.get(0L, (long) (byte) 10);
        org.junit.Assert.assertNull(byteBuf6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, 100L, (int) (byte) -1);
        long long4 = readCache3.size();
        long long5 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put(0L, 100L, byteBuf8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(0);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(0);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, 0);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (byte) -1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, 0);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(100);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (short) -1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        long long3 = readCache2.count();
        boolean boolean6 = readCache2.hasEntry((long) (short) 100, (long) 1);
        long long7 = readCache2.count();
        readCache2.close();
        readCache2.close();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put((long) (short) 10, 0L, byteBuf12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        long long3 = readCache2.count();
        boolean boolean6 = readCache2.hasEntry((long) (short) 100, (long) 1);
        io.netty.buffer.ByteBuf byteBuf9 = readCache2.get((long) (short) 1, (-1L));
        boolean boolean12 = readCache2.hasEntry((long) 0, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        readCache3.close();
        long long5 = readCache3.size();
        boolean boolean8 = readCache3.hasEntry((long) ' ', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 1, 1);
        boolean boolean6 = readCache3.hasEntry((long) (short) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1, (int) (short) -1);
        io.netty.buffer.ByteBuf byteBuf6 = readCache3.get(0L, 100L);
        boolean boolean9 = readCache3.hasEntry((long) 0, (long) (short) 100);
        org.junit.Assert.assertNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, 1L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        long long3 = readCache2.count();
        boolean boolean6 = readCache2.hasEntry((long) (short) 100, (long) 1);
        readCache2.close();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 1, (-1));
        boolean boolean6 = readCache3.hasEntry((long) ' ', (long) (short) 1);
        readCache3.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        long long5 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) 10, (long) (byte) -1, byteBuf8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        readCache2.close();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = readCache2.get((long) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        boolean boolean6 = readCache3.hasEntry((long) (byte) 100, (long) '4');
        long long7 = readCache3.count();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        readCache3.close();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (-1), 0L, byteBuf8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        long long5 = readCache3.count();
        long long6 = readCache3.size();
        long long7 = readCache3.count();
        long long8 = readCache3.size();
        long long9 = readCache3.count();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 100, (int) (short) 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer((int) '#');
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer((int) 'a');
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(1);
        org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        boolean boolean6 = readCache3.hasEntry((long) 'a', (long) '4');
        readCache3.close();
        io.netty.buffer.ByteBuf byteBuf10 = readCache3.get((long) 0, 100L);
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) ' ', 10L, byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteBuf10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 1, 1);
        long long4 = readCache3.size();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        boolean boolean6 = readCache3.hasEntry((long) 'a', (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = readCache3.hasEntry((long) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) ' ', (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = readCache3.get((long) (byte) 1, (long) 1);
        boolean boolean13 = readCache3.hasEntry((long) (short) 1, (long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) ' ', (long) (short) 10, byteBuf16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry((long) (short) 0, (-1L));
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (byte) 0, (long) (-1), byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(0);
        java.lang.Class<?> wildcardClass2 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1, (int) (short) -1);
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put(100L, (long) (-1), byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, 1L, (int) (short) 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, 100L);
        java.lang.Class<?> wildcardClass3 = readCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        long long5 = readCache3.count();
        long long6 = readCache3.size();
        long long7 = readCache3.count();
        long long8 = readCache3.size();
        java.lang.Class<?> wildcardClass9 = readCache3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) '#');
        java.lang.Class<?> wildcardClass3 = readCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) ' ', (long) 10);
        boolean boolean10 = readCache3.hasEntry((long) (short) 100, (long) ' ');
        long long11 = readCache3.size();
        readCache3.close();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put(1L, 0L, byteBuf15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 1, (-1));
        boolean boolean6 = readCache3.hasEntry((long) ' ', (long) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = readCache3.get(0L, 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.nio.ByteBuffer byteBuffer1 = org.apache.bookkeeper.util.ZeroBuffer.readOnlyBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        long long4 = readCache3.size();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get(10L, (long) '#');
        io.netty.buffer.ByteBuf byteBuf10 = readCache3.get((long) (short) 10, (long) (byte) 100);
        long long11 = readCache3.size();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 10);
        long long4 = readCache3.size();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.util.ZeroBuffer.put(byteBuffer0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.put(byte[], int, int)\" because \"dst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) ' ', (long) 10);
        boolean boolean10 = readCache3.hasEntry((long) (short) 100, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = readCache3.get((long) (short) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, 0L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 1, (int) (short) -1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, 100L);
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put((long) (byte) 10, (long) 1, byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 0, (int) (byte) -1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        boolean boolean6 = readCache3.hasEntry((long) 'a', (long) '4');
        readCache3.close();
        boolean boolean10 = readCache3.hasEntry(1L, 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) 10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 0);
        long long3 = readCache2.count();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) -1);
        long long3 = readCache2.count();
        boolean boolean6 = readCache2.hasEntry((long) (short) 100, (long) 1);
        long long7 = readCache2.count();
        readCache2.close();
        readCache2.close();
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put((long) '4', 100L, byteBuf12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        long long4 = readCache3.size();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get(10L, (long) '#');
        boolean boolean10 = readCache3.hasEntry((long) (short) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        readCache3.close();
        readCache3.close();
        readCache3.close();
        long long8 = readCache3.count();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) (byte) 10, (int) (byte) 100);
        long long4 = readCache3.size();
        boolean boolean7 = readCache3.hasEntry((long) 0, 1L);
        java.lang.Class<?> wildcardClass8 = readCache3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) '#');
        long long3 = readCache2.count();
        long long4 = readCache2.count();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) 1, (long) 0);
        boolean boolean10 = readCache3.hasEntry((long) ' ', 100L);
        long long11 = readCache3.count();
        boolean boolean14 = readCache3.hasEntry(1L, (long) (byte) -1);
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache3.put((long) (short) 100, (long) 10, byteBuf17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache3 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) ' ', (int) (byte) 100);
        long long4 = readCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = readCache3.get((long) ' ', (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = readCache3.get((long) (byte) 1, (long) 1);
        boolean boolean13 = readCache3.hasEntry((long) (short) 1, (long) (short) 10);
        readCache3.close();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.ReadCache readCache2 = new org.apache.bookkeeper.bookie.storage.ldb.ReadCache(byteBufAllocator0, (long) '#');
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            readCache2.put((long) 1, (long) (byte) 1, byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

