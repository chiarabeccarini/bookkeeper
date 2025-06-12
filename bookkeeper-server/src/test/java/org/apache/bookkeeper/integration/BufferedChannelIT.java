package org.apache.bookkeeper.integration;

import org.apache.bookkeeper.bookie.BufferedChannel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static org.junit.Assert.assertEquals;

public class BufferedChannelIT {

    private File tempFile;
    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;
    private final int BUFFER_CAPACITY = 1024;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("integration", ".bk");
        fileChannel = new FileOutputStream(tempFile).getChannel();
        bufferedChannel = new BufferedChannel(fileChannel, BUFFER_CAPACITY);
    }

    @After
    public void tearDown() throws Exception {
        fileChannel.close();
        tempFile.delete();
    }

    @Test
    public void testWriteAndReadFromDisk() throws Exception {
        // Scrivo dei dati
        ByteBuffer buffer = ByteBuffer.allocate(512);
        while (buffer.hasRemaining()) {
            buffer.put((byte) 42);
        }
        buffer.flip();
        bufferedChannel.write(buffer);
        bufferedChannel.flush(true);

        // Leggo dal file reale (fuori da BufferedChannel)
        byte[] readBack = new byte[512];
        try (FileInputStream fis = new FileInputStream(tempFile)) {
            int bytesRead = fis.read(readBack);
            assertEquals(512, bytesRead);
            for (byte b : readBack) {
                assertEquals(42, b);
            }
        }
    }
}
