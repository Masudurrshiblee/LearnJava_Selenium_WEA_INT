package datastrutureandalgorithm.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {

    // What is the difference between queue and priority Queue
    // Queue is an interface and it always peek first value from the list
    // But Priority Queue is a class and it peek value on alphabetic order or ascending order

    public static void main(String args[]){
        PriorityQueue<String> productList=new PriorityQueue<>();
        productList.add("Shirt");
        productList.add("pants");
        productList.add("Court");
        productList.add("Apron");
        productList.add("Belts");
        System.out.println(productList.peek());

        System.out.println("=====================================");

        PriorityQueue<Integer> productId=new PriorityQueue<>();
        productId.add(105);
        productId.add(104);
        productId.add(110);
        productId.add(100);
        productId.add(106);
        productId.add(107);
        System.out.println(productId.peek());
        for (Integer in:productId) {
            System.out.println("Product Id :"+in);
        }
        System.out.println("=============Using poll method");// Retrieve the value and remove from queue

        System.out.print("Lowest Id is :"+productId.poll());

        for (Integer in:productId) {
            System.out.println("Product Id :"+in);
        }
        System.out.println("=============Using peek method");// Retrieve the value , does not remove from queue

        System.out.println(productId.peek());
        for (Integer in:productId) {
            System.out.println("Product Id :"+in);
        }
    }

}
