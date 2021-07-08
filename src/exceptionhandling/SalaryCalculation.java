package exceptionhandling;
        // What is the difference between error and exception ?
          //Errors mostly occur at runtime that's they belong to an unchecked type.
          // Exceptions are the problems which can occur at runtime and compile time. And
          //Error mainly occurs in the code written by the developers.
public class SalaryCalculation {
    public static void main (String args[]){
        SalaryCalculation.doDivision(20,0);

    }

    public static int doDivision(int num1,int num2){
        int result=0;
        //return result;
        try{
            result=num1/num2;
            System.out.println("The division result will be "+ result);


        }catch(Exception e){
         //   e.printStackTrace();
System.out.println("This is arithmetic exception");
        }
       return result;





    }




}
