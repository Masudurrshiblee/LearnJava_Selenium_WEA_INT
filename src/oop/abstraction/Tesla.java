package oop.abstraction;

public class Tesla extends FlyingCar implements Car, AutoPilot{

    // While we use two interface in same class just provide comma
//when you need to bring property from one class to another class or one interface to another interface
// you need to use extends keyword
// When you need to bring properties from interface to class in that case you need to use implements keyword
  // A class can implements with multiple interface at a time but a class can be extends with one class at a time
    public void carStart() {
        System.out.println("Tesla has Car Start feature");
    }

    public void carStop() {
        System.out.println("Tesla has Car Stop feature");
    }

    public void carWheel() {
        System.out.println("Tesla has Car Wheel feature");
    }

    public void carSteering() {
        System.out.println("Tesla has Car Steering feature");
    }

    public void carEngine() {
        System.out.println("Tesla has car Engine feature");
    }

    public void carBreak() {
        System.out.println("Tesla has Car Brake feature");
    }

    public void navigation() {
        System.out.println("Tesla has Navigation feature");
    }

    public void cameras() {
        System.out.println("Tesla has cameras feature");
    }

    public void selfStart() {
        System.out.println("Tesla has selfStart feature");
    }

    public void keylessEntry() {
        System.out.println("Tesla has keylessEntry feature");
    }

    public void gps() {
        System.out.println("Tesla has gps feature");
    }

    public void emergencyBrake() {
        System.out.println("Tesla has emergencyBrake feature");
    }

    public void autoPilot() {
        System.out.println("Tesla has autoPilot feature");
    }

    public void largeDisplay() {
        System.out.println("Tesla has largeDisplay feature");
    }

    public void boostEngine() {
        System.out.println("Tesla has boostEngine feature");
    }

    public void flyingCat() {
        System.out.println("Modern car has flying car  feature");
    }
}
