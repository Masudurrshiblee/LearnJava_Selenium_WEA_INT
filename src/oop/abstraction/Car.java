package oop.abstraction;

public interface Car {
    // Interface is a guidelines for future or proto type design for your reference so that the
    // development team can follow this to complete a product.
    // Interface is blueprint of any class so any class can implements interface
    // in interface you can not only declare a variable , you must have to assign value for that variable.
    // Interface is 100% abstract.
    // In interface you can not create a method with a method body, only we can declare a method without body.
    // But if the method is static then it can have the body
   // String carName; This is Declaring a variable which is not allowed in interface

   String carName="Toyota";
   String price="20,000";
  // public void display();  // Method without method body

    // Declaring variable:
    String brand="Honda";
    int carQuantity=50;
    String Seat="2";
    String headlight="2";
    boolean gasTank=true;

    // Declaring method:
    public void carStart();
    public void carStop();
    public void carWheel();
    public void carSteering();
    public void carEngine();
    public void carBreak();
public void navigation();

    public static int carDoor( int doorNumber){
        int totalDoor=1*doorNumber;
        System.out.println("Total Door is "+totalDoor);
        return totalDoor;
    }
    public interface NewCar{
        public void carRoof();
    }
}
