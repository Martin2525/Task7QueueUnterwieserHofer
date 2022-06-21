package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidTest {

    Liquid testLiquid;
    SimpleDrink testDrink;

    @BeforeEach
    void setUp (){
        this.testLiquid = new Liquid("testname",1.1,1.2);
        this.testDrink = new SimpleDrink("testname2",testLiquid);

    }

    /**
     * tests if it is possible to get the name of a Liquid object
     */
    @Test
    void getName() {
        assertEquals("testname",testLiquid.getName());
    }
    /**
     * tests if it is possible to set the name of a Liquid object
     */
    @Test
    void setName() {
        testLiquid.setName("test2");
        assertTrue(testLiquid.getName() == "test2");
    }
    /**
     * tests if it is possible to get the volume of a Liquid object
     */
    @Test
    void getVolume() {
        assertEquals(1.1,testLiquid.getVolume());
    }
    /**
     * tests if it is possible to set the volume of a Liquid object
     */
    @Test
    void setVolume() {
        testLiquid.setVolume(1.4);
        assertEquals(1.4,testLiquid.getVolume());
    }
    /**
     * tests if it is possible to set the alcohol percent of a Liquid object
     */
    @Test
    void getAlcoholPercent() {
        assertEquals(1.2,testLiquid.getAlcoholPercent());
    }
    /**
     * tests if it is possible to set the alcohol percent of a Liquid object
     */
    @Test
    void setAlcoholPercent() {
        testLiquid.setAlcoholPercent(5.2);
        assertEquals(5.2,testLiquid.getAlcoholPercent());
    }
}