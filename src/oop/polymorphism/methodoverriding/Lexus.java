package oop.polymorphism.methodoverriding;

import oop.abstraction.ModernCar;

public class Lexus extends ModernCar {


    @Override
    public void cameras() {

    }

    @Override
    public void selfStart() {

    }

    @Override
    public void keylessEntry() {

    }

    @Override
    public void gps() {

    }

    @Override
    public void emergencyBrake() {

    }

    @Override
    public void remoteStart(){
        System.out.println("Lexus has remote start feature");
    }
}
