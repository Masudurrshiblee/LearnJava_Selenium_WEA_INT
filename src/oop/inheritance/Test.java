package oop.inheritance;

public class Test {
    public static void main(String args[]){

        // object creation of GrandFather class
        GrandFather gf=new GrandFather();
        gf.jump();

        // Object creation of Father Class
        Father father=new Father();

        // Now we can invoke all the methods and properties of GranFather class by father object
        //Because Father class is extends with GrandFather class even Father class empty

      //  father.fishing// This fishing from GrandFather class
   father.swim();  // this method from father class
father.playGame();  // This method from grandfather class
   // object creation of son class
        Son allSon=new Son();
        allSon.run();  // Accessing from grandfather class
        allSon.sing(); // Accessing method from Father class
        allSon.walk();  // Accessing from son class

     // Object creation of Daughter class
     Daughter daughter=new Daughter();
     daughter.sleep();// Accessing from grandfather class
        daughter.truthfulness();  // Accessing from father class
        daughter.beauty();  // Accessing from daughter class

    }
}
