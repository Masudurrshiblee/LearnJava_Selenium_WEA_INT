package controlflow;

public class LearnIfElse {
    // Control flow: Make some decision
    //If condition is true then it will execute if block
    // if condition is not true then it will execute else block

    public static void main(String[] args) {
        System.out.println("Learning If Else Condition");
        int number=10;
        if(number==30) {
            System.out.println("Number is not correct");
        } else{
                System.out.println("Number is correct");

        }
        int age=18;
        if(age>=18 && number==32){
            System.out.println("This person is adult");
        }else{
            System.out.println("That person is not adult");
        }
        String gender= "Male";
        if(number<=10 && age>=18 ||gender=="Male"){
            System.out.println("Can apply for this position");
        }
        else{
            System.out.println("Can not apply for this post");
        }
        if(number<=10 && age>=18 ||gender=="Female"){
            System.out.println("Can apply for this position");// when we use or condition and one side
        }                                                     // of condition is true then it will execute
        else{                                                 // if block
            System.out.println("Can not apply for this post");
        }

        if(number<=10 && age>=18 && gender=="Female"){ // if we use and operator all condition has to be true
            System.out.println("Can apply for this position"); // to run if block
        }
        else{
            System.out.println("Can not apply for this post");
        }

    }
}