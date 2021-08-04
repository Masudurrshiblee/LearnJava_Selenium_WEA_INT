package oop.inheritance;

public class GrandFather {
    //Declaring Variable
    public String grandFatherFavoriteFood="Rice";
    public String grandFatherFavoriteSport="Soccer";
    public String grandFatherFavoriteRide="Bike";
    public String grandFatherFavoritePerson="GrandMother";
    public String grandFatherSSN="12353435666";
    private String grandFatherAccountNumber;

    // Creating Constructor
    public GrandFather(){  // This is Default constructor is  created by using Generate formula

    }
    
// Creating single parameterized constructor by Generating
    public GrandFather(String grandFatherFavoriteFood) {
        this.grandFatherFavoriteFood = grandFatherFavoriteFood;
    }

//Creating Multiple parameterized constructor by Generating


    public GrandFather(String grandFatherFavoriteSport, String grandFatherFavoriteRide,
                       String grandFatherFavoritePerson, String grandFatherSSN) {
        this.grandFatherFavoriteSport = grandFatherFavoriteSport;
        this.grandFatherFavoriteRide = grandFatherFavoriteRide;
        this.grandFatherFavoritePerson = grandFatherFavoritePerson;
        this.grandFatherSSN = grandFatherSSN;
    }
    // Creating Getter and setter method for private constructor


    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }
    // Creating Method
    public void fishing(){
       System.out.println("Grandfather love fishing");
    }
    public void jump(){
        System.out.println("Grandfather can jump");
    }
    public void playGame(){
        System.out.println("Grandfather do not love to play game");
    }

    public void run(){
        System.out.println("Grandfather can not run");
    }
    public void sleep(){
        System.out.println("Grandfather love to sleep");
    }
}
