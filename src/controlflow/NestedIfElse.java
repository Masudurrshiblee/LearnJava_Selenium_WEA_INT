package controlflow;

public class NestedIfElse {
    // Nested If else condition means condition inside another condition
    public static void main(String[]args){
        int age=25;
        int weight= 50;
        if(age>=25){
            if(weight>=50){  // This condition is inside another condition
               System.out.println("You are eligible to donate blood");
            }
            else{
                System.out.println("You are not eligible to donate blood");
            }
        }

    }
}
