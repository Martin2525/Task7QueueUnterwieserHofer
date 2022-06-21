package at.campus02.bsd;

import at.campus02.bsd.StringQueue;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@DisplayName("Testing StringQueue methods")
public class StringQueueTest {

    List<String> elements;
    StringQueue stringQueue;



    @BeforeEach
    void setUp() {
       this.elements = new ArrayList<String>();
    this.stringQueue = new StringQueue(5,elements);
    elements.add("boom");
    elements.add("bam");
    elements.add("pow");

    }

    /**
     * tests if String objects can be added to the queue successfully
     */
    @ParameterizedTest
    @ValueSource (strings = "hallo")
    void testOffer(){
        stringQueue.offer("hallo");
        assertEquals("hallo",elements.get(3));
    }
    /**
     * tests if String objects can be added to the queue successfully
     */
    @Test
    void testPoll(){
        assertEquals(elements.get(0), stringQueue.poll());
    }

    /**
     * tests if String objects can be removed from the queue successfully
     */
    @Test
    void testRemove(){
        stringQueue.remove();
        assertEquals(elements.get(0), "bam");
    }

    /**
     * tests if first element in queue can be peeked successfully
     */
    @Test
    void testPeek(){
        assertEquals(elements.get(0), stringQueue.peek());
    }
    /**
     * tests if first element in queue can be peeked successfully
     */
    @Test
    void testElement(){
        assertEquals(elements.get(0), stringQueue.element());
    }
}
