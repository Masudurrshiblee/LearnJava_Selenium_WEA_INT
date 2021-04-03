package controlflow;

import java.util.Scanner;

public class IfElseThirdPractise {
    public static void main(String [] args){
        IfElseThirdPractise.stateRule();

    }
    public static void stateRule(){
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter Your age");
        int age =input1.nextInt();
        if(age>=18 && age<=70){
            System.out.println("Adult person and can buy cigarettes");
        }
        else{
            System.out.println("Can not buy cigarettes because it may affect body");
        }

    }


}
