package exceptionhandling;

public class LearnFinalFinallyFinalize {

    final int number=10;  // in this case variable value cannot be change

    public static void main(String args[]){
        LearnFinalFinallyFinalize.doDivision(22,0);
           }

    public static int doDivision(int num3, int num4){
        int result=0;
        try{
            result=num3/num4;
            System.out.println("Division value is "+ result);
        } catch(Exception e){
            //e.printStackTrace();
            System.out.println("This is arithmetic exception");
        } finally{
            int total=num3+num4;
            System.out.println("The total value is "+ total);
            System.out.println("Learning exception handling");
        }

        return result;

    }
}