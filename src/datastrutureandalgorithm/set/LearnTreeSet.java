package datastrutureandalgorithm.set;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main (String args[]){
        TreeSet<String> iphoneBrand=new TreeSet<>();
        iphoneBrand.add("12 pro max");
        iphoneBrand.add("12  max");
        iphoneBrand.add("12 ");
        iphoneBrand.add("11 pro max");
        System.out.println(iphoneBrand);
        System.out.println(iphoneBrand.first());
        System.out.println(iphoneBrand);
    }
}
