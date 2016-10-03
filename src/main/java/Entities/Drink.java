package Entities;

import java.util.HashMap;
import java.util.Map;

public interface Drink{

    boolean makeDrink(String drinkType);

    Map<Integer, String> drinks = new HashMap<Integer, String>();


}
