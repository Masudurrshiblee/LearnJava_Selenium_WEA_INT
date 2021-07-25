package oop.encapsulation;

public class TestPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();// Creating object of Pizza, by creating object we can call only public variable
        // pizza.pizzaName
        // To call a private variable to public class we need to use getter and setter method as follows:
        //getter Method

      //  System.out.println(pizza.pizzaName); Here pizzaName is public variable, so we can call directly

       // Calling private variable
        pizza.setPizzaTopping("Chicken");

        pizza.setPizzaQty(5);
        pizza.setPizzaSize();
        pizza.setTypesOfPizza("Any");
        pizza.setPizzaAvailable(false);
        System.out.println("Topping:" +pizza.getPizzaTopping()+" ," + " Quantity:" + pizza.getPizzaQty() +" ,"
               + " Availability:" + pizza.isPizzaAvailable());

    }


}
