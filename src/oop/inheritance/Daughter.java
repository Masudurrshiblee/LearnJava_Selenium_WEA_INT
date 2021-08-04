package oop.inheritance;

public class Daughter extends Father{
    //Declaring Variable
    public String daughterFavoriteFood="Pizza";
    public String daughterFavoriteSport="WatchMovie";
    public String daughterFavoriteRide="RedCar";
    public String daughterFavoritePerson="Parents";
    public String daughterSSN="42353435666";
    private String daughterAccountNumber;

    public Daughter() {
    }

    public Daughter(String daughterFavoriteFood) {
        this.daughterFavoriteFood = daughterFavoriteFood;
    }

    public Daughter(String daughterFavoriteSport, String daughterFavoriteRide,
                    String daughterFavoritePerson, String daughterSSN) {
        this.daughterFavoriteSport = daughterFavoriteSport;
        this.daughterFavoriteRide = daughterFavoriteRide;
        this.daughterFavoritePerson = daughterFavoritePerson;
        this.daughterSSN = daughterSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }
    public void beauty(){
      System.out.println("Daughter are beautiful to their parents");
    }
    public void polite(){
        System.out.println("Daughters are polite");
    }
    public void obedient(){
        System.out.println("Daughters are obedient");
    }



}
