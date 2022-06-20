package at.campus02.bsd;

public interface IDrinks {
    

    boolean offerDrinks(SimpleDrink obj);

    SimpleDrink pollDrinks();

    SimpleDrink removeDrinks();

    SimpleDrink peekDrinks();

    SimpleDrink element();
}
