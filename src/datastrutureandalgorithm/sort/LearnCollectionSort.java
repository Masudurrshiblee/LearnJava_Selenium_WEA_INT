package datastrutureandalgorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LearnCollectionSort {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("Zebra");
        al.add("Dog");
        al.add("Cat");
        al.add("Rat");
        Collections.sort(al);
        System.out.println(al);


    }
}

