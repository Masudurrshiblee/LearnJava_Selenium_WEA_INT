package datastrutureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class Novel {

    int id;
    String name, author, publisher;
    int quantity;

    public Novel(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;


    }
    public static void main (String args[]){
        // Creating HashMap of Novel
        HashMap<Integer,Novel> map=new HashMap<Integer,Novel>();
        // Creating Novels
        Novel n1=new Novel(1001,"James willium","Bob","ABC Academy",200);
        Novel n2=new Novel(1001,"James willium","Bob","BCD Academy",300);
        Novel n3=new Novel(1001,"James willium","Bob","CDE Academy",400);

        // Adding Novel to the map
        map.put(1,n1);
        map.put(2,n2);
        map.put(3,n3);
       for(Map.Entry<Integer,Novel>entry:map.entrySet()){
           int key=entry.getKey();
           Novel n= entry.getValue();
           System.out.println(key +" details");
           System.out.println(n.id+" "+n.name+" "+n.author+" "+n.author+" "+n.publisher+" "+n.quantity);
       }
    }
}
