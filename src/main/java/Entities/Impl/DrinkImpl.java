package Entities.Impl;

import Entities.Drink;
import Entities.Receipt;

import java.util.HashMap;
import java.util.Map;

public class DrinkImpl implements Drink {

    private String drinkName;
    private Receipt drinkReceipt;
    private Map<Integer, String> drinks = new HashMap<Integer, String>();

    {
        drinks.put(1, "Coffee");
        drinks.put(1, "Tea (Black)");
        drinks.put(1, "Tea (Green)");
        drinks.put(1, "Cacao");
    }

    public boolean makeDrink(String drinkType) {
        return false;
    }

    public String getDrink() {
        return drinkName;
    }

    public void setDrink(String drink) {
        this.drinkName = drink;
    }

    public Drink getDrinkById(String id){
        if id.equals("1");
        this.drinkName = "Coffee";
        return

    }
}
