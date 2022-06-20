/*
 * Project: Task7QueueUnterwieserHofer
 * Authors:  Martin Unterwieser & Rene Hofer
 * Last Change: 20.06.2022
 */




package at.campus02.bsd;

/**
 * Interface that includes all necessary methods for StringQueue class
 */
public interface IQueue {


    /**
     * Add String Object to queue, returns true if object was added, else returns false
     * @param obj the String object that is added to the queue
     **/
  public abstract boolean offer(String obj);


  /**
   * Returns and deletes first element of queue. If queue is empty, null is returned
   **/
  public abstract String poll();


  /**
   * Returns and deletes first element of queue. If queue is empty, NoSuchElementException is thrown
   * @throws java.util.NoSuchElementException
   **/
  public abstract String remove();


  /**
   * Returns first element of queue, returns null if queue is empty
   **/
  public abstract String peek();


  /**
   * Returns first element of queue. If queue is empty, NoSuchElementException is thrown
   * @throws java.util.NoSuchElementException
   **/
  public abstract String element();
}