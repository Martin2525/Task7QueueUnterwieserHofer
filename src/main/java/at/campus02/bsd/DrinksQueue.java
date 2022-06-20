package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinksQueue {

    private List<SimpleDrink> drinkList = new ArrayList<SimpleDrink>();
    private int maxSize = 5;

    ///First Mistake fixed : wrong constructor
    public DrinksQueue(int maxsize) {
        this.maxSize = maxSize;
    }


    //Second Mistake : < instead of =
    @Override
    public boolean offer(SimpleDrink obj) {
        if (drinkList.size() < maxSize)
            drinkList.add(obj);
        else
            return false;

        return true;
    }

    //Third mistake : Does not return null
    @Override
    public SimpleDrink poll() {
        SimpleDrink element = peek();

        if (drinkList.size() == 0) {
            return null;

        }else{
            drinkList.remove(0);
        }

        return element;
    }

    @Override
    public SimpleDrink remove() {
        SimpleDrink element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public SimpleDrink peek() {
        SimpleDrink element;
        if (drinkList.size() > 0)
            element = drinkList.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public SimpleDrink element() {
        SimpleDrink element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}
}
