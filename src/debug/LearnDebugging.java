package debug;

import java.util.Scanner;

public class LearnDebugging {
    public static void main(String[] args) {
//      int num1=10;
//      int num2=10;
//      int num3=10;
//      int num4=10;
//      int num5=10;
//      int num6=10;
//      int sum=num1+num2; // In this line of code if we put sign (-) , then sum will be changed, but it will not
                         // show any error in code, this is logical mistake , To handle this type mistake we need
                          // to do debugging.
        // What is break point: It is the point where debugging start. It pause running of code
     // System.out.println("summation value will be "+sum);
LearnDebugging.doPattern();
    }
    public static void doPattern(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter row number");
        int rowNumber=input.nextInt();
        for(int i=1;i<=rowNumber; i++){  // In this line of code if i put only condition i<rowNumber then it will
                                         // show one less row based on entering number, This is also logical error.
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
