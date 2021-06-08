package controlflow;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String args[] ){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        int rowNumber=input.nextInt();
        for(int i=1; i<=rowNumber; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");// Instead of just print if i put println it will print column
                // System.out.println(J+" "); // It will show different result
            }
           System.out.println();
        }
    }
}
