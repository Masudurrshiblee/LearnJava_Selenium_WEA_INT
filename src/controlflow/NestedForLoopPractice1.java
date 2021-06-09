package controlflow;

import java.util.Scanner;
// This is very very important for the interview ????????????

public class NestedForLoopPractice1 {
    public static void main(String args[] ){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        int rowNumber= input.nextInt();
        for(int i=1; i<=rowNumber; i++){
            for( int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
