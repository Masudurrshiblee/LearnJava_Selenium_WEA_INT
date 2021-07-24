package singleton;

public class Pizza {

    String pizzaName;
    String toppingName;
    int qty;
    public Pizza(){

    }
    public static void main(String args[]){
        LearnSingleton learn=LearnSingleton.getInstance();
        System.out.println(learn.name);
    }
}
