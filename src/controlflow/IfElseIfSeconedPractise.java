package controlflow;

import java.util.Scanner;

public class IfElseIfSeconedPractise {
    public static void main(String [] args){
        IfElseIfSeconedPractise.retirementTime();

    }
    public static void retirementTime(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        if(age>=65 && age<=70){
            System.out.println("This is retirement Time");
        }
        else if(age>=50 && age<=65){
            System.out.println("This is not retirement Time");
        }
        else if(age>=62 && age<=65){
            System.out.println("This Early retirement Time");
        }
        else if(age>=65 && age<=68){
            System.out.println("This is proper retirement Time");
        }
        else{
            System.out.println("You can take any time self retirement ");
        }
    }
}
