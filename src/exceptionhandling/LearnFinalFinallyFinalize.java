package exceptionhandling;

public class LearnFinalFinallyFinalize {

    final int number=10;  // in this case variable value cannot be change

    public static void main(String args[]){
        LearnFinalFinallyFinalize lf1= new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf2= new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf3= new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf4= new LearnFinalFinallyFinalize();
        lf1.doDivision(22,0);
        // here we created 4 object but we only use one object, When we run these code other it will hold extra space
        // If we use finalize method then this code will not take space in jVM
        System.gc();
           }

    public int doDivision(int num3, int num4){
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