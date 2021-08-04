package oop.encapsulation;

public class Mobile {
    public String company;
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean availability;
    public Mobile(){

    }
    // Getter and Setter method

    public String getBrand(){
        return brand;
    }
    public void setBrand( String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel( String model){
        this.model= model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice( double price){
        this.price=price;
    }

    public boolean isAvailability() {// it is exception because boolean is not return type data type
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
