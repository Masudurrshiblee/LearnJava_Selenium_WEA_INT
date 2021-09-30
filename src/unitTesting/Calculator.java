package unitTesting;

public class Calculator {

    public static int doSum(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        int total = num1 + num2;
        System.out.println("Total value is " + total);
        return total;
    }

    public static int doSub(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        int result = num1 - num2;
        System.out.println("Substraction value will be " + result);
        return result;
    }
// To test the method
   // public static void main(String[] args) {
    //    Calculator.doSum(12, 10);
    //}
}