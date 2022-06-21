package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@DisplayName("Testing IDrinksQueue methods")
public class IDrinksQueueTest {

List<SimpleDrink> drinkList;
IDrinksQueue drinksQueue;

    Liquid testLiquid = new Liquid("testLiquid",0.2,0.0);
    SimpleDrink testDrink = new SimpleDrink("testDrink",testLiquid);

    @BeforeEach
    void setUp() {
        this.drinkList = new ArrayList<SimpleDrink>();
        this.drinksQueue = new IDrinksQueue(drinkList,5);
        drinkList.add(testDrink);



    }

    /**
     * tests if an SimpleDrink object can be added to the queue
     */
    @Test
    void testOffer(){
        drinksQueue.offerDrinks(testDrink);
        assertEquals("testDrink",drinkList.get(1).getName() );
    }
    /**
     * tests if an SimpleDrink object can be added to the queue
     */
    @Test
    void testPoll(){
        assertEquals(drinkList.get(0), drinksQueue.pollDrinks());
    }

    /**
     * tests if SimpleDrink are successfully removed from queue
     */
    @Test
    void testRemove(){
        SimpleDrink testDrink2 = new SimpleDrink("testdrink",testLiquid);
        drinkList.add(testDrink2);
        drinksQueue.removeDrinks();
        assertEquals(drinkList.get(0), testDrink2);
    }

    /**
     * tests if correct first SimpleDrink in queue is peeked
     */
    @Test
    void testPeek(){
        assertEquals(drinkList.get(0), drinksQueue.peekDrinks());
    }
    /**
     * tests if correct first SimpleDrink in queue is peeked
     */
    @Test
    void testElement(){
        assertEquals(drinkList.get(0), drinksQueue.element());
    }
}

