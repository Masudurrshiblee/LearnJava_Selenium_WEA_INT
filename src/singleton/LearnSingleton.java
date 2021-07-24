package singleton;

public class LearnSingleton {

    String name="Jonathon";
    private LearnSingleton(){
    }

    // This class contain one private constructor that's why it is called singleton class
    // If you want to call this class in different class then we have to create an instance of this class
    // and method by following way:
    // Creating instance:
    public static LearnSingleton instance= new LearnSingleton();
    //Creating return type method:
    public static LearnSingleton getInstance(){
        return instance;
    }


    public static void main(String args[]){
        LearnSingleton learn=new LearnSingleton();
    }
}
