package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @BeforeEach
    void setUp (){
        Liquid testLiquid = new Liquid("testname",1.1,1.2);
        SimpleDrink testDrink = new SimpleDrink("testname2",testLiquid);

    }

    @Test
    void getVolume() {
        Liquid testLiquid = new Liquid("testname",1.1,1.2);
        assertEquals(1.1,testLiquid.getVolume());
    }

    @Test
    void getAlcoholPercent() {
        Liquid testLiquid = new Liquid("testname",1.1,1.2);
        assertEquals(1.2,testLiquid.getAlcoholPercent());
    }

    @Test
    void isAlcoholic() {

    }

    @Test
    void getName() {
        Liquid testLiquid = new Liquid("testname",1.1,1.2);
        assertEquals("testname",testLiquid.getName());
    }

    @Test
    void setName() {
        Liquid testLiquid = new Liquid("testname",1.1,1.2);
        testLiquid.setName("test2");
        assertTrue(testLiquid.getName() == "test2");
    }
}