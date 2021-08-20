package datastrutureandalgorithm.arrayList;

import java.util.ArrayList;

public class LearnArrayList {

    ArrayList<String> studentAddress=new ArrayList<>();
    static ArrayList<Integer> studentMobileNumber=new ArrayList<Integer>();
    public static void main(String args[]){
        LearnArrayList learn=new LearnArrayList(); // Creating object
        learn.studentAddress.add("Phila,PA");  //Assigning value using add method
        learn.studentAddress.add("Bensalem,PA");
        learn.studentAddress.add("Bristol,PA");
        learn.studentAddress.add("Treavose,PA");
        System.out.println(learn.studentAddress.get(1));
    }
}
