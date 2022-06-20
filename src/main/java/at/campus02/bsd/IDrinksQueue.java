package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class IDrinksQueue implements IDrinks {

    private List<SimpleDrink> drinkList = new ArrayList<SimpleDrink>();
    private int maxSize = 5;

    public IDrinksQueue(List<SimpleDrink> drinkList, int maxSize) {
        this.drinkList = drinkList;
        this.maxSize = maxSize;
    }

    @Override
    public boolean offerDrinks(SimpleDrink obj) {
        if (drinkList.size() < maxSize)
            drinkList.add(obj);
        else
            return false;

        return true;
    }

    @Override
    public SimpleDrink pollDrinks() {
        SimpleDrink element = peekDrinks();

        if (drinkList.size() == 0) {
            return null;

        }else{
            drinkList.remove(0);
        }

        return element;
    }

    @Override
    public SimpleDrink removeDrinks() {
        SimpleDrink element = pollDrinks();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public SimpleDrink peekDrinks() {
        SimpleDrink element;
        if (drinkList.size() > 0)
            element = drinkList.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public SimpleDrink element() {
        SimpleDrink element = peekDrinks();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}

