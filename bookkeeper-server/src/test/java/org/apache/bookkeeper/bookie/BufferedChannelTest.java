package org.apache.bookkeeper.bookie;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static org.junit.Assert.*;

public class BufferedChannelTest {

    private File tempFile; //file su cui si scrive/legge durante i test
    private FileChannel fileChannel; //canale per accedere al file
    private BufferedChannel bufferedChannel; //oggetto da testare
    private final int BUFFER_CAPACITY = 1024; // capacità del buffer 1 KB

    @Before
    public void setUp() throws IOException {
        // Crea un file temporaneo
        tempFile = File.createTempFile("test", ".bk");
        // Apre un FileChannel in scrittura
        fileChannel = new FileOutputStream(tempFile).getChannel();
        // Crea un BufferedChannel con capacità specificata
        bufferedChannel = new BufferedChannel(fileChannel, BUFFER_CAPACITY);
    }

    @After
    public void tearDown() throws IOException {
        // Chiude il canale e cancella il file temporaneo
        fileChannel.close();
        tempFile.delete();
    }

    /**
     * Test 1 Write: Scrittura di buffer vuoto
     * crea un ByteBuffer vuoto con capacità 0, chiama write
     * e verifica che la scrittura restituisca 0, cioè nessun byte è stato scritto.
     */
    @Test
    public void testWriteEmptyBuffer() throws IOException {
        ByteBuffer emptyBuffer = ByteBuffer.allocate(0);
        int bytesWritten = bufferedChannel.write(emptyBuffer);
        assertEquals(0, bytesWritten);
    }

    /**
     * Test 2 Write: Scrittura inferiore alla capacity
     * crea un ByteBuffer da 512 byte, quindi di dimensione inferiore alla capacità del buffer,
     * lo riempie con byte fittizzi usando il metodo fillBuffer,
     * chiama write e verifica che il numero di byte scritti sia 512.
     */
    @Test
    public void testWriteSmallBuffer() throws IOException {
        ByteBuffer smallBuffer = ByteBuffer.allocate(512);
        fillBuffer(smallBuffer); // Riempi con dati fittizi
        int bytesWritten = bufferedChannel.write(smallBuffer);
        assertEquals(512, bytesWritten);
    }

    /**
     * Test 3 Write: Scrittura esattamente pari alla capacity
     * crea un ByteBuffer con capacità esattamente pari a BUFFER_CAPACITY,
     * lo riempie con byte fittizi e chiama write, verificando che il numero di byte scritti sia uguale a BUFFER_CAPACITY.
     */
    @Test
    public void testWriteExactCapacityBuffer() throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_CAPACITY);
        fillBuffer(buffer);
        int bytesWritten = bufferedChannel.write(buffer);
        assertEquals(BUFFER_CAPACITY, bytesWritten);
    }

    /**
     * Test 4 Write: Scrittura oltre la capacity
     * crea un ByteBuffer con capacità doppia rispetto a BUFFER_CAPACITY,
     * lo riempie con byte fittizi e chiama write,
     * verificando che il numero di byte scritti sia pari a 2 * BUFFER_CAPACITY.
     * Questo test verifica che il BufferedChannel gestisca correttamente buffer di dimensioni maggiori della capacità.
     * Se il buffer è più grande della capacità, dovrebbe scrivere tutto il contenuto del buffer in più passaggi.
     */
    @Test
    public void testWriteLargeBuffer() throws IOException {
        ByteBuffer largeBuffer = ByteBuffer.allocate(2 * BUFFER_CAPACITY);
        fillBuffer(largeBuffer);
        int bytesWritten = bufferedChannel.write(largeBuffer);
        assertEquals(2 * BUFFER_CAPACITY, bytesWritten);
    }

    /**
     * Test 5 Write: Passaggio di buffer null
     * verifica che se chiami write con un buffer null, venga sollevata una NullPointerException.
     * JUnit si aspetta che il metodo write lanci questa eccezione, se arriva, il test passa.
     */
    @Test(expected = NullPointerException.class)
    public void testWriteNullBuffer() throws IOException {
        bufferedChannel.write(null);
    }

    // Metodo di utilità per riempire i buffer con dati dummy
    private void fillBuffer(ByteBuffer buffer) {
        while (buffer.hasRemaining()) {
            buffer.put((byte) 1); // Metti un byte finto finché c'è spazio
        }
        buffer.flip(); // Prepara il buffer per la lettura da parte di write()
    }


    // Test 1 Read: Lettura con buffer vuoto
    @Test
    public void testReadWithEmptyBuffer() throws IOException {
        ByteBuffer emptyBuffer = ByteBuffer.allocate(0); // crea un buffer con zero byte disponibili
        int bytesRead = bufferedChannel.read(emptyBuffer, 0); // provo a leggere dal file a posizione 0
        assertEquals(0, bytesRead); // mi aspetto 0 byte letti
    }

    // Test 2 Read: Lettura valida dopo scrittura
    @Test
    public void testReadAfterWrite() throws IOException {
        ByteBuffer writeBuffer = ByteBuffer.allocate(512); // creo buffer da scrivere
        fillBuffer(writeBuffer); // lo riempio con dati finti
        bufferedChannel.write(writeBuffer); // scrivo i dati

        ByteBuffer readBuffer = ByteBuffer.allocate(512); // buffer in cui leggere
        int bytesRead = bufferedChannel.read(readBuffer, 0); // leggo dalla posizione 0
        assertEquals(512, bytesRead); // mi aspetto di leggere esattamente 512 byte
    }

    // Test 3 Read: Lettura da posizione oltre la fine
    @Test
    public void testReadBeyondEndOfFile() throws IOException {
        ByteBuffer writeBuffer = ByteBuffer.allocate(512);
        fillBuffer(writeBuffer);
        bufferedChannel.write(writeBuffer);

        ByteBuffer readBuffer = ByteBuffer.allocate(512);
        try {
            bufferedChannel.read(readBuffer, 9999);
            fail("Expected an exception when reading beyond EOF");
        } catch (Exception e) {
            assertTrue(e instanceof IOException || e instanceof IllegalArgumentException);
        }
    }

    // Test 4 Read: Buffer null
    @Test(expected = NullPointerException.class)
    public void testReadWithNullBuffer() throws IOException {
        bufferedChannel.read(null, 0); // provo a leggere con un buffer null, deve lanciare eccezione
    }

}