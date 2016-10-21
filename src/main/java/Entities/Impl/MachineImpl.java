package Entities.Impl;

import Entities.Drink;
import Entities.Machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MachineImpl implements Machine {

    private List<Drink> drinksList = new ArrayList<Drink>();

    public List<Drink> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drink> drinksList) {
        this.drinksList = drinksList;
    }

    public boolean start() {
        getAvailableDrinksList();
        addDrink();
        return true;
    }

    public boolean makeDrinks(List<Drink> drinksList) {
        return false;
    }

    public boolean makeDrink(List<String> drinksList) {
        return false;
    }

    public boolean addDrink() {
        boolean flag = true;

        while (flag) {
            Scanner in = new Scanner(System.in);
            System.out.print("> ");
            String str = in.next();

            if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4")) {
                drinksList.add(str);
                System.out.println("Drink successfully added");
            } else if (str.equals("end")) {
                flag = false;
            } else {
                System.out.println("Please choose a drink.");
            }
        }
        return true;
    }

    public boolean getAvailableDrinksList() {
        System.out.println("Hello. Please choose a drink from the list and press 'enter'");
        System.out.println("Drinks List:\n1 - Coffee \n2 - Tea (Black) \n3 - Tea (Green) \n4 - Cacao");
        return true;
    }

    public boolean takeMoney(Double money) {
        return false;
    }

    public boolean giveOdd(Double money) {
        return false;
    }

    public boolean addQuantity(Integer quantity) {
        return false;
    }
}
