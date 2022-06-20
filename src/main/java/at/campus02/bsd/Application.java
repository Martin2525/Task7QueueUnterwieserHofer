/*
 * Project: Task7QueueUnterwieserHofer
 * Authors:  Martin Unterwieser & Rene Hofer
 * Last Change: 20.06.2022
 */



package at.campus02.bsd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {


        /**
         * Creates Set-Up for List for Drinks
         * @param Liquid is made of String name, double volume and double alcoholpercentage
         * @param Simpledrink is made of String name and Liquid
         */

         List<SimpleDrink> drinkList = new ArrayList<>();


         Liquid beer = new Liquid("hopfenwasser",12.2,5);
         SimpleDrink beer2 = new SimpleDrink("SuperBier",beer);

         Liquid wine = new Liquid("Traubenwasser",1,19);
         SimpleDrink wine2 = new SimpleDrink("Superwein",wine);


        /**
         * adding Simpledrinks to list without IQueue
         */
         drinkList.add(0,beer2);
         drinkList.add(1,wine2);


        IDrinksQueue workingList = new IDrinksQueue(drinkList,5);


        /**
         * changing DrinksList with IQueue Methods
         */
        workingList.offerDrinks(wine2);
        workingList.pollDrinks();
        workingList.peekDrinks();


        workingList.removeDrinks();
        workingList.removeDrinks();

        /**
        * @throws element throws exception here because workingList is empty
        */
        workingList.element();

        /**
         * Standart Print-Out Test that should not be reached because element
         */



    }
}
