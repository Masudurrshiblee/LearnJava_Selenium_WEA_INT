package datastrutureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTraverse {
    public static void main(String args []){
        int [] numbers={34,87,76,35,23,90,17,26,48,300,200,105};
        LearnHashMapTraverse.printFrequency(numbers);
    }
    public static void printFrequency(int[]numbers){
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i< numbers.length;i++){
            Integer count=hmap.get(numbers[i]);
            if(hmap.get(numbers[i])==null){
                hmap.put(numbers[i],1);
            }else{
                hmap.put(numbers[i],++count);
            }
        }
        for(Map.Entry mp: hmap.entrySet()){
            System.out.println("Frequency of "+mp.getKey() +" "+ mp.getValue());
        }
    }
}
