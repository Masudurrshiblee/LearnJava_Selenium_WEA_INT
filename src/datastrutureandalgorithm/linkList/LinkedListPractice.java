package datastrutureandalgorithm.linkList;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main (String args[]){

        // Creating list using linkedList
        LinkedList<Book> list=new LinkedList<>();

        //Creating object of Book
        Book b1=new Book(101,"Jonas Mark","James ","hayden k",10);
        Book b2=new Book(102,"Jonas Alex","James willium","hayden d",12);
        Book b3=new Book(103,"Jonas Miller","pOM willium","hayden E",14);
        // aDDING bOOK TO THE LIST
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Using for each loop
        for(Book b:list){
            System.out.println(b.id +" "+b.name +" "+b.author +" "+b.publisher +" "+b.quantity);
        }

    }
}
