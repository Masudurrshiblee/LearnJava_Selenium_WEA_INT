package operators;

public class ArithmeticOperator {
    // + Additive operator
    // - Subtraction operator
    // * multiplication operator
    // / Division operator
    // % Remainder operator : after division value the rest of value will be remainder value

    public static void main(String[] args) {
        int  num1 = 70;
        int num2 = 20;
        int addition = num1+ num2;
        System.out.println("Addition value will be "+addition);
        int subtraction = num1- num2;
        System.out.println("subtraction value will be "+subtraction);
        int multiplication = num1* num2;
        System.out.println("Multiplication value will be "+multiplication);
        int Division = num1/ num2;
        System.out.println("Division value will be "+Division);
        int remainder = num1% num2;
        System.out.println("Remainder value will be "+remainder);

        double num3=25.5;
        double num4=10;
        double remaider1=num3%num4;
        System.out.println("Remainder value will be "+remaider1);
    }
}
