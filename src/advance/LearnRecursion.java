package advance;

public class LearnRecursion {
    // Is a process in which a method is called itself continuously.
    //Must call itself
    //Must have a base case
    // Must change its state and move toward the base case
int count;
    public void stInfo(){
        count++;
        if(count <=5) {
            System.out.println("Student name is james willium");
            stInfo();  // It is calling itself that means it will run continuously, so we need put condition
            // to run countable number
        }
    }
    public static void main(String[] args){
        LearnRecursion obj = new LearnRecursion();
        obj.stInfo();
    }
}
