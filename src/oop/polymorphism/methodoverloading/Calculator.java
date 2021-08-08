package oop.polymorphism.methodoverloading;

// Method overloading: Create method with same name but different signature of pattern of parameter

public class Calculator {
    public static void main  (String args[]){
        Calculator.doSum(10,20);
        Calculator.stInfo("james","Ny",32);
    }
    public static void doSum(int number1,int number2){
        int total=number1 + number2;
        System.out.println("Total value is "+total);
    }
    public static void doSum(int number1,int number2,int number3){
        int total=number1+number2+number3;
        System.out.println("Total value is "+total);
    }
    public static void doSum(int number1,int number2,int number3, String name){
        int total=number1 + number2+number3;
        System.out.println("Total value is "+total);
    }
    public static void stInfo(){
System.out.println("Student information");
    }

    public static void stInfo(String name,String address){
        System.out.println("Student name is "+name+"student address is" +address);
    }

    public static void stInfo(String name,String address, int age){
        System.out.println("Student name is "+name+"student address is" +address+" Student age is "+ age);
    }

}
