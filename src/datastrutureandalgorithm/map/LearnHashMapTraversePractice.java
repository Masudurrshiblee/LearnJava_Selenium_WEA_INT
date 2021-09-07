package datastrutureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTraversePractice {
    public static void main(String args[]){
        int [] num1={12,13,23,45,56,67,89,68,65,89,90};
        LearnHashMapTraversePractice.printFrequency(num1);
    }
    public static void printFrequency(int num1[]){
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for (int i=0;i<num1.length;i++){
           Integer count= hmap.get(num1[i]);
            if(hmap.get(num1[i])==null){
                hmap.put(num1[i],1);
            }else{
                hmap.put(num1[i],++count );
            }
        }
        for(Map.Entry mp:hmap.entrySet()){
            System.out.println("Frequency is "+mp.getKey() +" "+mp.getValue());
        }
    }
}
