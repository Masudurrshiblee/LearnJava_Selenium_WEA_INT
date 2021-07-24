package oop.abstraction;

public class Test {
    public static void main(String[] args) {
        GeneralMotor gm = new GeneralMotor();
        gm.carStart();
        gm.carStop();
        //gm.brand="BMW";  IT is not possible because variable and value was final
        System.out.println(gm.brand);
        Car.carDoor(4);
        Tesla tesla =new Tesla();
        tesla.boostEngine();
        tesla.carBreak();

    }
}