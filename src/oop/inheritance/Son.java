package oop.inheritance;

public class Son extends Father {
    //Declaring Variable
    public String sonFavoriteFood="Burger";
    public String sonFavoriteSport="VideoGame";
    public String sonFavoriteRide="Car";
    public String sonFavoritePerson="GF";
    public String sonSSN="32353435666";
    private String sonAccountNumber;

    public Son() {
    }

    public Son(String sonFavoriteFood) {
        this.sonFavoriteFood = sonFavoriteFood;
    }

    public Son(String sonFavoriteSport, String sonFavoriteRide, String sonFavoritePerson, String sonSSN) {
        this.sonFavoriteSport = sonFavoriteSport;
        this.sonFavoriteRide = sonFavoriteRide;
        this.sonFavoritePerson = sonFavoritePerson;
        this.sonSSN = sonSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void walk(){
       System.out.println("Son do not like to walk");
    }
    public void sleep(){
        System.out.println("Son more like to sleep");
    }
    public void firstFoodLover(){
        System.out.println("Son do like First Food");
    }
    public void respect(){
        System.out.println("Son do not respect older");
    }

}
