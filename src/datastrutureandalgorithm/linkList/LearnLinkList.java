package datastrutureandalgorithm.linkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LearnLinkList {

    public static void main(String args[]){
        LinkedList<String> link1=new LinkedList<String>();
        // Adding VAlue in link1
        link1.add("Raja");
        link1.add("Ryan");
        link1.add("Raju");
        link1.add("Rajon");
        System.out.println(link1);
        System.out.println("=====================================");
        // Using Iterator to make make next line

        Iterator<String> itr=link1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=====================================");
        // Traversing the list of element in reverse order

        Iterator<String> it=link1.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=====================================");

        // Declaring another link
        LinkedList <String> link2=new LinkedList<>();
        link2.add("willium");
        link2.add("walter");
        link2.add("kelvin");
        link1.addAll(link2);
System.out.println(link1);
        System.out.println("=====================================");

// Removing element
        link1.removeAll(link2);
        System.out.println(link1);
        System.out.println("=====================================");

// Declaring 3rd link
        LinkedList<String> link3=new LinkedList<>();
        link3.add("Kevin");
        link3.add("Malven");
        link3.add("George");
        link2.addAll(link3);
        link2.addFirst("Hasan");
        link2.addLast("Karim");
        System.out.println(link2);

    }
}
