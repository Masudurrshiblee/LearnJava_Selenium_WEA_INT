package oop.inheritance;

//public class Father extends GrandFather {

public class Father extends GrandFather{
    //Declaring Variable
    public String fatherFavoriteFood="Chicken";
    public String fatherFavoriteSport="Cricket";
    public String fatherFavoriteRide="MotorBike";
    public String fatherFavoritePerson="Mother";
    public String fatherSSN="22353435666";
    private String fatherAccountNumber;

    public Father() { // Default Constructor
    }
// single parameterized constructor

    public Father(String fatherFavoriteFood) {
        this.fatherFavoriteFood = fatherFavoriteFood;
    }
// multiple parameterized constructor
    public Father(String fatherFavoriteSport, String fatherFavoriteRide,
                  String fatherFavoritePerson, String fatherSSN) {
        this.fatherFavoriteSport = fatherFavoriteSport;
        this.fatherFavoriteRide = fatherFavoriteRide;
        this.fatherFavoritePerson = fatherFavoritePerson;
        this.fatherSSN = fatherSSN;
    }
// For private variable we declaring getter and setter method
    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }
    //Creating method
    public void swim(){
System.out.println("Father like to swim");
    }

    public void sing(){
        System.out.println("Father like to sing");
    }
    public void truthfulness(){
        System.out.println("Father always tells truth");
    }
    public void honest(){
        System.out.println("Father is honest");
    }
    public void hardWorker(){
        System.out.println("Father is hardWorker");
    }
}
