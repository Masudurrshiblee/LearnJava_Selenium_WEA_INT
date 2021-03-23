package advance;

public class RecursionPractise2 {
    int count;
   public void stContact(){
       count++;
       if( count<=5) {
           System.out.println("please provide cell number");
           stContact();
       }
   }
   public static void main(String[] args){
       RecursionPractise2 obj2=new RecursionPractise2();
       obj2.stContact();
   }
}
