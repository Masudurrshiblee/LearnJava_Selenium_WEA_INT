package operators;

public class ConditionalOperator {

    // (&&) This is AND conditional operator : All condition must have to be true
    // (||) This is OR conditional operator : If one condition is true then block of code will be executed
    // false || false = false
    // false || true = true
    // true || false = true
    // true || true = true

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 45;
        if(num1==50 && num2==45){
            System.out.println("Both condition is true so block will be executed");
        }

        if(num1==55 && num2==45){
            System.out.println("Both condition is not true so block will not be executed");
        }

        if(num1==55 || num2==45){
            System.out.println("One condition is true so block will be executed");
        }
    }
}
