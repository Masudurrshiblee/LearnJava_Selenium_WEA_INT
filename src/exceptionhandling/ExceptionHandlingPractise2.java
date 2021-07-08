package exceptionhandling;

public class ExceptionHandlingPractise2 {
    public static void main(String args[]){
        ExceptionHandlingPractise2 exceptionHandlingPractise2=new ExceptionHandlingPractise2();
        exceptionHandlingPractise2.doDivision(10,0);
    }
    public int doDivision(int num1,int num2){  // Non static method
        int result=0;
        try {
            result = num1 / num2;
            System.out.println("The result is " + result);
        }catch(Exception exception){
            System.out.println("This is an arithmetic exception");

        }
        return result;
    }
}
