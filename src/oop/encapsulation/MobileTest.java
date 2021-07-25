package oop.encapsulation;

public class MobileTest {
    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.setBrand("Iphone");
        //System.out.println(mobile.getBrand());

        mobile.setModel("MAx 12");
        mobile.setPrice(1200);
        mobile.setAvailability(true);
        System.out.println(mobile.getBrand()+ " "+ mobile.getModel()+" "+ mobile.getPrice() +" "
                + mobile.isAvailability());
    }
}
