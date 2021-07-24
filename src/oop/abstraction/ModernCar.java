package oop.abstraction;

public abstract class ModernCar {
// Abstract class which is not fully abstract

    String modernCarBrand="Audi";
    double modernCarSuggestedPrices=75000;

    // Abstract method
    public abstract void cameras();
    public abstract void selfStart();
    public abstract void keylessEntry();
    public abstract void gps();
    public abstract void emergencyBrake();

    // Static and non static methods are allowed in abstract class

    public void remoteStart(){
        System.out.println("Modern Car has remote start feature");
    }
    public static void dualClimateControl(){
        System.out.println("Modern Car has dual climate control  feature");
    }

}
