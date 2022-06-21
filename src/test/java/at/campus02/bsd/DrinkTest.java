package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    Liquid testLiquid;
    SimpleDrink testDrink;

    @BeforeEach
    void setUp (){
        this.testLiquid = new Liquid("testname",1.1,1.2);
        this.testDrink = new SimpleDrink("testname2",testLiquid);

    }

    /**
     * tests if it is possible to get the volume of a SimpleDrink object
     */
    @Test
    void getVolume() {
        assertEquals(1.1,testDrink.getVolume());
    }
    /**
     * tests if it is possible to get the alcohol percent of a SimpleDrink object
     */
    @Test
    void getAlcoholPercent() {
        assertEquals(1.2,testDrink.getAlcoholPercent());
    }
    /**
     * tests if a SimpleDrink object has an alcohol percent above 0
     */
    @Test
    void isAlcoholic() {

    }
    /**
     * tests if it is possible to get the name of a SimpleDrink object
     */
    @Test
    void getName() {
        assertEquals("testname2",testDrink.getName());
    }
    /**
     * tests if it is possible to set the name of a SimpleDrink object
     */
    @Test
    void setName() {
        testDrink.setName("test2");
        assertEquals("test2", testDrink.getName());
    }

    /**
     * tests if it is possible to instantiate a SimpleDrink object
     */
    @Test
    void DrinkTest(){
        SimpleDrink simpleDrink = new SimpleDrink("testDrink",testLiquid);
        assertNotNull(simpleDrink);
    }
}