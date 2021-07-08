package exceptionhandling;

import method.LearnMethod;

public class LearnExceptionHandling {
    public static void main(String args[]){
        int num1=20;
        int num2=0;
        int result=num1/num2;
        System.out.println("The result is" +result);


        LearnMethod learnMethod = new LearnMethod(); // Calling non static method from different class by creating a
                                                    // Object of that class
        learnMethod.doSubtraction(20,0);      // Calling method by created object
    }
}
