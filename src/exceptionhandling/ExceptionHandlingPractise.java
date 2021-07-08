package exceptionhandling;

public class ExceptionHandlingPractise {
    public static void main (String args []){
        ExceptionHandlingPractise.doDivision(20,0);
    }
   public static int doDivision(int num3, int num4){
       int result=0;
       try{
           result=num3/num4;
           System.out.println("Division value is "+ result);
       } catch(Exception e){
           //e.printStackTrace();
           System.out.println("This is arithmetic exception");
       }
       return result;



   }

}
