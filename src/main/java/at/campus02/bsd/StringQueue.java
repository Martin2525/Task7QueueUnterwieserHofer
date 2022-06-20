/*
 * Project: Task7QueueUnterwieserHofer
 * Authors:  Martin Unterwieser & Rene Hofer
 * Last Change: 20.06.2022
 */


package at.campus02.bsd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * For method comments check out IQueue interface
 */
public class StringQueue implements IQueue {


  /**
   * list of String elements
   */
  private List<String> elements = new ArrayList<String>();

  /**
   * Integer value that describes the maximum size of the queue
   */
  private int maxSize = 5;


  /**
   * Constructor for StringQueue class
   */
  public StringQueue(int maxsize, List<String> elements) {
    this.maxSize = maxSize;
    this.elements = elements;
  }




  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }


  @Override
  public String poll() {
    String element = peek();

    if (elements.size() == 0) {
      return null;

    }else{
      elements.remove(0);
    }

    return element;
  }

  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}