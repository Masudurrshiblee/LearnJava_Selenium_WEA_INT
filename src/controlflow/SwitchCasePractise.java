package controlflow;

import java.util.Scanner;

public class SwitchCasePractise {

    public static void main(String args[]) {

        int daySerial =4;
        String dayName;
        switch (daySerial) {
            case 1:
                dayName = " Monday";
                break;
            case 2:
                dayName = " Tuesday";
                break;
            case 3:
                dayName = " wednesday";
                break;
            case 4:
                dayName = " Thursday";
                break;
            case 5:
                dayName = " friday";
                break;
            case 6:
                dayName = " Saturday";
                break;

            case 7:
                dayName = " Sunday";
                break;
            default:
                dayName="No day is available for the week ";
        }
        System.out.println("Day name is" + dayName);
    }
}
