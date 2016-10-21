package Entities;

import java.util.List;

public interface Machine {
    boolean makeDrink(List<String> drinksList);

    boolean addDrink();

    boolean takeMoney(Double money);

    boolean giveOdd(Double money);

    boolean addQuantity(Integer quantity);

    boolean start();

    boolean getAvailableDrinksList();

    boolean makeDrinks(List<Drink> drinksList);

}
