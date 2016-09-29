package Entities;

import java.util.Map;

public interface Machine {
    boolean makeDrink(Map<String, Integer> drink);

    boolean addDrink(String drinkType);

    boolean takeMoney(Double money);

    boolean giveOdd(Double money);

    boolean addQuantity(Integer quantity);

}
