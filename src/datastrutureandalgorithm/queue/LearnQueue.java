package datastrutureandalgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String args[]) {
        Queue<String> name = new LinkedList<>();// Here LinkedList constructor is use because Queue interface
        // extends LinkedList
        name.add("Kamal");
        name.add("jamal");
        name.add("tamal");
        name.add("Damal");
        name.add("Zamal");
        for (String st : name) {
            System.out.println("Queue list is :" + st);
        }
        System.out.println("============Remove Method");
        name.remove("Damal");
        for (String st : name) {
            System.out.println("Queue list is :" + st);
        }


        System.out.println("============================Element Method");
       System.out.println(name.element()) ;
        for (String st : name) {
            System.out.println("Queue list is :" + st);
        }


        System.out.println("============================Poll Method");// Poll method is pull the first value and keep
                                                                // the rest of value is same
            name.poll();
            System.out.println(name.poll());
            for (String st : name) {
                System.out.println("Queue list is :" + st);
            }

            System.out.println("============Peek Method");// Peek method is pick the first value and remove rest
            System.out.println(name.peek());
        for (String st : name) {
            System.out.println("Queue list is :" + st);
        }
        }

}