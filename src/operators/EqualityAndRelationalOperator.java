package operators;

public class EqualityAndRelationalOperator {

    // == Equal to
    //!= Not Equal
    // > Grater than
    // >= Grater than Equal
    //< Less than
    // <= Less than Equal

    public static void main(String [] args ){
        int num1 = 25;
        int num2 = 30;
        if (num1 == num2){      // Condition is not true so if block will not be executed
            System.out.println("number1 and num2 is Equal");
        }
        if (num1 != num2){    // When condition is true that time if block will be executed
            System.out.println("num1 and num2 is not equal");
        }
        if (num1>num2){
            System.out.println("num1 is greater than num2");
        }
        if (num1<num2){
            System.out.println("num1 is less than num2");
        }
        if (num1>=num2){
            System.out.println("num1 is greater than equal num2");
        }
        if (num1<=num2){
            System.out.println("num1 is less than equal num2");
        }

    }


}
