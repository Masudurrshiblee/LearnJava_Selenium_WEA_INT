package oop.encapsulation;

public class Pizza {

    public String pizzaName;
    private String pizzaTopping;
    private int pizzaQty;
    private char pizzaSize;
    private String typesOfPizza;
    private boolean IsPizzaAvailable;


    public Pizza() {

    }

   /* public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, String toppingName, int pizzaQty, char pizzaSize, boolean IsPizzaAvailable) {
        this.pizzaName = pizzaName;
        this.pizzaTopping = toppingName;
        this.pizzaQty = pizzaQty;
        this.pizzaSize = pizzaSize;
        this.IsPizzaAvailable = IsPizzaAvailable;
    }*/

    // If any class has private variable and wants to access from another class then you must have declare
    //getter and setter method in that where private variable is declared
    // Getter and setter method
    // Getter method is return type

    // Getter Method:
    public String getPizzaTopping() {
        // Syntax : public typesOfVariable getVariableName(){return VariableName;}
        return pizzaTopping;
    }

    // Setter Method: Non return type


    public void setPizzaTopping(String pizzaTopping) {
        // public void setVariableName( typesOfVariable VariableName){ this.variableName=VariableName;
        this.pizzaTopping = pizzaTopping;
    }
    public int getPizzaQty(){
        return pizzaQty;
    }
    public void setPizzaQty(int pizzaQty){
        this.pizzaQty=pizzaQty;
    }

    public char getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize() {
        this.pizzaSize = pizzaSize;
    }

    public String getTypesOfPizza() {
        return typesOfPizza;
    }

    public void setTypesOfPizza(String typesOfPizza) {
        this.typesOfPizza = typesOfPizza;
    }

    public boolean isPizzaAvailable() {
        return IsPizzaAvailable;
    }

    public void setPizzaAvailable(boolean pizzaAvailable) {
        IsPizzaAvailable = pizzaAvailable;
    }
}
