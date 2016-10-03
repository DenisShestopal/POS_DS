package Entities.Impl;

import Entities.Machine;

import java.util.Map;
import java.util.Scanner;

public class MachineImpl implements Machine {

    public boolean start() {
        drinksList();


        return true;
    }

    public boolean makeDrink(Map<String, Integer> drink) {


        return false;
    }

    public boolean addDrink(String drinkType) {
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        System.out.print("> ");
        String str = in.next();

        if(!str.equals("1") || !str.equals("2") || !str.equals("3") || !str.equals("4"))
            System.out.println("Please choose a drink.");
        else{
            if()
        }

        return true;
    }

    public boolean drinksList() {
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
