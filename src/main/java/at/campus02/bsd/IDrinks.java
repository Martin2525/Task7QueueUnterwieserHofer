/*
 * Project: Task7QueueUnterwieserHofer
 * Authors:  Martin Unterwieser & Rene Hofer
 * Last Change: 20.06.2022
 */


package at.campus02.bsd;

/**
 * Interface that includes all necessary methods for IDrinksQueue class
 */

public interface IDrinks {

    /**
     * Add Simpledrink object to queue, returns true if object was added, else returns false
     * @param obj the Simpledrink object that is added to the queue
     **/
    boolean offerDrinks(SimpleDrink obj);

    /**
     * Returns and deletes first element of queue. If queue is empty, null is returned
     **/
    SimpleDrink pollDrinks();

    /**
     * Returns and deletes first element of queue. If queue is empty, NoSuchElementException is thrown
     * @throws java.util.NoSuchElementException
     **/
    SimpleDrink removeDrinks();

    /**
     * Returns first element of queue, returns null if queue is empty
     **/
    SimpleDrink peekDrinks();

    /**
     * Returns first element of queue. If queue is empty, NoSuchElementException is thrown
     * @throws java.util.NoSuchElementException
     **/
    SimpleDrink element();
}
