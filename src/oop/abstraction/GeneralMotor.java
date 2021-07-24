package oop.abstraction;
public class GeneralMotor implements Car{
    // This general is now not a class , it is now now concrete class because all the properties from car interface
    // GeneralMotor is accessing
    // In concrete class we reassign value,declare a variable and declare a  static and non static method

    String brand="BMW";
    String carModel="R123";
    String modelYear="2022";
    static double price=70000;

    public static void carInfo(){
       System.out.println("This is general Motor car information");
    }
    public boolean willAvailability(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }


public void carStart() {
        System.out.println("General Motor car has start feature");
    }

    public void carStop() {
        System.out.println("General Motor car has stop feature");
    }

    public void carWheel() {
        System.out.println("General Motor car has car wheel feature");
    }

    public void carSteering() {
        System.out.println("General Motor car has car steering feature");
    }

    public void carEngine() {
        System.out.println("General Motor car has Engine feature");
    }

    public void carBreak() {
        System.out.println("General Motor car has Brake feature");
    }

    public void navigation() {
        // When you add any method in interface after implements then you have to implements again the class
        // which one was implemented.
    }
}
