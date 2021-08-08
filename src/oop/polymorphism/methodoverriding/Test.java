package oop.polymorphism.methodoverriding;

import oop.abstraction.Car;
import oop.abstraction.GeneralMotor;

public class Test {
// Override Method: When a method is declared in subClass with same name and parameter or signature which was
    // declared in superClass which have same name and same type of parameter or signature this method should be
    // declared as override in subClass
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Bmw1 bmw1 = new Bmw1();
        bmw.autoStop();  // This method from Super Class
        bmw1.autoStop();  // This method from Sub Class
        Lexus lexus = new Lexus();
        lexus.remoteStart();
        // Creating object
        GeneralMotor gm= new GeneralMotor();
        gm.carBreak();

        Car myCar=new GeneralMotor();
        myCar.navigation();  // Here navigation method from Car interface not from general class
        // This method is from GeneralMotor and Object (myCar) has no accessibility on its
        // constructor, it works what class or interface is used to create object
        // In that case to access that method we need to do casting


        ((GeneralMotor) myCar).carInfo();// Casting of Method: Hold the mouse on that method and add cast qualifier


    }
}
