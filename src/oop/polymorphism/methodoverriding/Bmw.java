package oop.polymorphism.methodoverriding;

public class Bmw {
    // Static method
    public static void autoStart(){
        System.out.println("BMW has auto start feature");
    }
    public static void autoTemperatureControl(){
        System.out.println("BMW has auto Temperature control  feature");
    }
    //Non static method

    public void autoLaneControl(){
        System.out.println("BMW has auto lane control feature");
    }

    public void autoStop(){
        System.out.println("BMW has auto stop feature");
    }



}
