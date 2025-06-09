package org.apache.bookkeeper.bookie;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.*;

/*
classe di test JUnit per BufferedChannel
La funzione è quella di testare il comportamento del metodo write
usando un approccio black-box, basandomi solo su input e output osservabili
Il metodo write(ByteBuffer src) scrive il contenuto di src in un buffer interno
e lo scrive su un FileChannel quando il buffer è pieno.
*/
public class BufferedChannelTest {

    private Path tempFile;
    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;
    private final int capacity = 1024;

    /**
     * Setup per i test: crea un FileChannel temporaneo e un BufferedChannel
     * con una capacità specificata.
     */
    @Before
    public void setup() throws IOException {
        tempFile = Files.createTempFile("test-buffer", ".tmp");
        fileChannel = FileChannel.open(tempFile, StandardOpenOption.READ, StandardOpenOption.WRITE);
        bufferedChannel = new BufferedChannel(fileChannel, capacity);
    }

    /**
     * PRIMO TEST che verifica: se scrivo un buffer vuoto (ByteBuffer.allocate(0)),
     * il metodo write restituisce 0, come atteso.
     */
    @Test
    public void testWriteEmptyBuffer() throws IOException {
        ByteBuffer empty = ByteBuffer.allocate(0);
        int written = bufferedChannel.write(empty);
        assertEquals(0, written);
    }

    /**
     * SECONDO TEST che verifica che il metodo write funzioni correttamente
     * quando il buffer di input (src) ha una dimensione inferiore alla capacità del canale writeBuffer.
     */
    @Test
    public void testWriteBufferSmallerThanCapacity() throws IOException {
        // creo un buffer più piccolo della capacità
        ByteBuffer input = ByteBuffer.allocate(capacity / 2);
        for (int i = 0; i < input.capacity(); i++) {
            input.put((byte) i); // ci scrivo dei dati per renderlo non vuoto
        }
        input.flip(); // lo preparo per la lettura

        int written = bufferedChannel.write(input); // invoco il metodo da testare

        // deve scrivere tutti i byte nel writeBuffer
        assertEquals(capacity / 2, written); // verifica che siano stati scritti tutti i byte
        // la posizione del canale non dovrebbe essere avanzata (perché non abbiamo flushato)
        assertEquals(0, fileChannel.position()); // la posizione del canale deve rimanere 0, verifichiamo che non ci sia scrittura su disco, cioè che il buffer interno non si sia svuotato
    }

    /**
     * TERZO TEST verifica il caso in cui il buffer di input (src) è più grande
     * della capacità del buffer interno writeBuffer, ad esempio il doppio.
     */
    @Test
    public void testWriteBufferLargerThanCapacity() throws IOException {
        // creo un buffer due volte più grande del writeBuffer
        ByteBuffer input = ByteBuffer.allocate(capacity * 2);
        for (int i = 0; i < input.capacity(); i++) {
            input.put((byte) i); // ci scrivo dati incrementali
        }
        input.flip(); // pronto per lettura

        int written = bufferedChannel.write(input);

        // deve aver scritto tutti i byte del buffer
        assertEquals(capacity * 2, written);
        // poiché il writeBuffer è stato forzato a scrivere almeno una volta, ci aspettiamo che qualcosa sia andato su disco
        assertTrue(fileChannel.position() > 0);
    }

    /**
     * QUARTO TEST verifica il comportamento quando il buffer di input (src)
     * ha esattamente la stessa dimensione del buffer interno writeBuffer, cioè capacity.
     */
    @Test
    public void testWriteBufferExactlyCapacity() throws IOException {
        ByteBuffer input = ByteBuffer.allocate(capacity);
        for (int i = 0; i < input.capacity(); i++) {
            input.put((byte) i); // dati incrementali
        }
        input.flip();

        int written = bufferedChannel.write(input);

        // Devono essere scritti tutti i byte
        assertEquals(capacity, written);
        // La scrittura dovrebbe aver causato un flush del buffer interno, quindi ci aspettiamo una scrittura su file
        assertTrue(fileChannel.position() > 0);
    }

}
