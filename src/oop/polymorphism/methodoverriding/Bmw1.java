package oop.polymorphism.methodoverriding;

public class Bmw1 extends Bmw {

@Override
    public void autoLaneControl(){
        System.out.println("BMW1 has advance auto lane control feature");
    }
@Override
    public void autoStop() {
        System.out.println("BMW1 has auto advance stop feature");

    }
}