package datastrutureandalgorithm.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    public static void main (String args []){
        Set<String> mobileBrand=new HashSet<>();
        mobileBrand.add("iphone");
        mobileBrand.add("Samsung");
        mobileBrand.add("LG");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.remove("LG"));
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.contains("LG"));

    }
}
