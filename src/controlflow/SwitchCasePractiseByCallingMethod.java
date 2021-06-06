package controlflow;

import java.util.Scanner;

public class SwitchCasePractiseByCallingMethod {
    public static void main(String[]args){
        SwitchCasePractiseByCallingMethod.findMonth();

    }
    public static void findMonth(){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter month serial");
        int monthSerial = input.nextInt();
        String monthName;

        switch (monthSerial) {

            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                if(monthName=="July"){
                    System.out.println("This is the month of independence");
                }else{
                    System.out.println("This is not the month of independence");
                }
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Not Available";
        }
        System.out.println("Month name is " + monthName);
    }
}
