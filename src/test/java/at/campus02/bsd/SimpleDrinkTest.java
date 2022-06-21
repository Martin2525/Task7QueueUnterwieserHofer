package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing SimpleDrink class")
public class SimpleDrinkTest {

    Liquid testLiquid;
    SimpleDrink testDrink;
    Liquid alcoholicLiquid;
    SimpleDrink alcoholicDrink;

    @BeforeEach
    void setUp(){
        this.testLiquid = new Liquid("testLiquid",0.2,0.0);
        this.testDrink = new SimpleDrink("testDrink",this.testLiquid);
        this.alcoholicLiquid = new Liquid("alcoholicLiquid",0.2,12.0);
        this.alcoholicDrink = new SimpleDrink("alcoholicDrink",this.alcoholicLiquid);
    }

    /**
     * tests if it is possible to get the volume of a SimpleDrink object
     */
    @Test
    void getVolumeTest(){
        assertEquals(0.2,testDrink.getVolume());
    }
    /**
     * tests if it is possible to get the alcohol percent of a SimpleDrink object
     */
    @Test
    void getAlcoholPercent(){
        assertEquals(0.0,testDrink.getAlcoholPercent());
    }
    /**
     * tests if a SimpleDrink object contains alcohol
     */
    @Test
    void isNotAlcoholicTest(){
        assertFalse(testDrink.getAlcoholPercent() < 0);
    }
    /**
     * tests if a SimpleDrink object contains alcohol
     */
    @Test
    void isAlcoholicTest(){

        assertEquals(testDrink.isAlcoholic(),false);
    }

    /**
     * tests if a SimpleDrink object can be instantiated
     */
    @Test
    void SimpleDrinkTest (){
        SimpleDrink simpleDrink = new SimpleDrink("test",testLiquid);
        assertNotNull(simpleDrink);
    }

}
