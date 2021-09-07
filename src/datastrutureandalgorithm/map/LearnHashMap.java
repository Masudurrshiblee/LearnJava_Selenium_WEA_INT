package datastrutureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
public static void main(String args[]){
    // Creating HashMap
    HashMap<Integer,String> map=new HashMap<Integer, String>();
    map.put(101,"Roman");
    map.put(102,"koman");
    map.put(103,"joman");
    map.put(104,"homan");
    System.out.println(map);


    System.out.println("==Iterating Hashmap=====");
//
    for(Map.Entry m:map.entrySet()){
        System.out.println(m.getKey() +" "+ m.getValue());




    }
    // Creating Another HashMap
    HashMap<Integer,String> map2=new HashMap<>();
    map2.put(105,"Thomas");
    map2.put(106,"Thomas Junior");
    System.out.println(map2);

    //Adding both hashmap
    map.put(108,"Rafayel");
    map.putAll(map2);
System.out.println("After adding all Hashmap");
for(Map.Entry m:map.entrySet()){
    System.out.println(m.getKey() +" "+m.getValue());
}

    // putifabsent method
    map.putIfAbsent(107,"hyaiden");
    System.out.println("After adding putifAbsentmethod");
    for(Map.Entry m:map.entrySet()) {
        System.out.println(m.getKey() + " " + m.getValue());
    }
        // Remove method
        // Key based removal
        map.remove(101);
        System.out.println("Updated List"+map);

        // Value based removal
        map.remove(102);
        System.out.println("Updated list elerment" +map);

        // Replacing element
    map.replace(102,"Maruf");
    System.out.println("After replacing "+map);

}
}
