package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

         List<SimpleDrink> drinkList = new ArrayList<>();

         Liquid beer = new Liquid("hopfenwasser",12.2,5);
         SimpleDrink beer2 = new SimpleDrink("SuperBier",beer);

         Liquid wine = new Liquid("Traubenwasser",1,19);
         SimpleDrink wine2 = new SimpleDrink("Superwein",wine);


         drinkList.add(0,beer2);
         drinkList.add(1,wine2);


        IDrinksQueue workingList = new IDrinksQueue(drinkList,5);

        workingList.offerDrinks(wine2);
        workingList.pollDrinks();
        workingList.peekDrinks();


        workingList.removeDrinks();
        workingList.removeDrinks();


        workingList.element();

        //Does not reach because element throws exception
        System.out.println("TEST");


    }
}
