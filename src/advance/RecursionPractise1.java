package advance;

public class RecursionPractise1 {
    int count;
    public void stAddress(){
        count++;
                if(count <=4){
                    System.out.println("Student has to use their new address");
                    stAddress();
                }

    }
    public static void main(String[] args){
        RecursionPractise1 obj1= new RecursionPractise1();
        obj1.stAddress();
    }
}
