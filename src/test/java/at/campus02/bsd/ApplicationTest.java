package at.campus02.bsd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void main() {

        List<SimpleDrink> drinkList = new ArrayList<>();
        Liquid wine = new Liquid("Traubenwasser",1,19);
        SimpleDrink wine2 = new SimpleDrink("Superwein",wine);
        IDrinksQueue workingList = new IDrinksQueue(drinkList,5);


        assertNull(workingList.pollDrinks());

        assertNull(workingList.peekDrinks());

        assertTrue(workingList.offerDrinks(wine2));

        workingList.removeDrinks();

        boolean thrown1 = false;

        try {
            workingList.removeDrinks();
        }catch (Exception NoSuchElementException){
            thrown1 = true;
        }
        assertTrue(thrown1);

        boolean thrown2 = false;

        try {
            workingList.element();
        }catch (Exception NoSuchElementException){
            thrown2 = true;
        }
        assertTrue(thrown2);














    }
}