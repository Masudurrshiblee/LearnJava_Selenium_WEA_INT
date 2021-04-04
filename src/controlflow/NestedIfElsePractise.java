package controlflow;

import java.util.Scanner;

public class NestedIfElsePractise {
    public static void main(String[]args){
        NestedIfElsePractise.findGenius();
    }
    public static void findGenius(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your score and find your position");
        int score= scan.nextInt();
        if(score>=90 && score<=99){
            if(score>=90 && score<=91){
                System.out.println("Result is regular A+");
            }else if(score>=90 && score<=95){
                System.out.println("he is talent");
            }else if(score>=90 && score<=97){
                System.out.println("He is genius");
            }
            else{
                System.out.println("He is outstanding");
            }
        }
        else {
            System.out.println("He earn A-");
        }
    }
}
