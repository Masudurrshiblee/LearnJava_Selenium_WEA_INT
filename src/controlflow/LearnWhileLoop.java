package controlflow;
// While loop : Pre condition check
public class LearnWhileLoop {
    public static void main (String args[] ){
        int age=22;
        while(age>=18){
            System.out.println("The person is adult");
            age--;


            // Nested while loop
            int serialNumber=1;
            while(serialNumber<5){
                System.out.println("The person will get free entrance");
                serialNumber++;
            }
        }
        System.out.println("Another example");
        int newAge=21;
        String gender="Male";
        while(newAge<25){
            System.out.println("Time is for register");
            if(gender=="Female") {
                System.out.println("Does not need to register");
            }
            else{
                System.out.println("Need to register");

            }
       newAge++;
        }
    }
}
