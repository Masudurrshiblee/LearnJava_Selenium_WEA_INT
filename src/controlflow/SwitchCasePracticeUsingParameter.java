package controlflow;

import java.util.Scanner;

public class SwitchCasePracticeUsingParameter {
    public static void main(String[] args) {

        SwitchCasePracticeUsingParameter.foodMenu(4);

    }

    public static void foodMenu(int foodSerial) {


        String foodName;

        switch (foodSerial) {
            case 1:
                foodName = "Pizza";
                break;
            case 2:
                foodName = "Burger";
            case 3:
                foodName = "Sandwich";
                break;
            case 4:
                foodName = "Briyani";
                break;
            case 5:
                foodName = "Pasta";
                break;
            case 6:
                foodName = "Coffee";
                break;
            default:
                foodName = "Food name is not available";
                break;
        }
        System.out.println("Selected food name is " + foodName);


    }
}
