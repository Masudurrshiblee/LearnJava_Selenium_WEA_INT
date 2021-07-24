package debug;

import java.util.Scanner;

public class DebuggingPractice {
    public static void main(String args []) {
        DebuggingPractice debugger= new DebuggingPractice();
        debugger.doPattern();

    }
    public void doPattern(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter row Number");
        int rowNumber=input.nextInt();
        for(int i=1; i<=rowNumber; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
