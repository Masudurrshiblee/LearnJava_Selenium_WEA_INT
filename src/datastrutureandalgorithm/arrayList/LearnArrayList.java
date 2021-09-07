package datastrutureandalgorithm.arrayList;

import java.util.ArrayList;

public class LearnArrayList {
    // Declaring an arraylist:
    ArrayList<String> studentAddress = new ArrayList<>();

    static ArrayList<Integer> studentMobileNumber = new ArrayList<Integer>();

    public static void main(String args[]) {
        LearnArrayList learn = new LearnArrayList(); // Creating object to add value in non static arrayList
        learn.studentAddress.add("Phila,PA");  //Assigning value using add method
        learn.studentAddress.add("Bensalem,PA");
        learn.studentAddress.add("Bristol,PA");
        learn.studentAddress.add("Treavose,PA");
        System.out.println(learn.studentAddress.get(1));
        System.out.println(learn.studentAddress.size());
// To retrieve all values we need to use for each loop
        for(String st: learn.studentAddress){
            System.out.println("Students are "+st);
        }
        System.out.println("=============================================");
        // For static ArrayList we do not need to create object
        studentMobileNumber.add(234234232);
        studentMobileNumber.add(234234237);
        studentMobileNumber.add(234234238);
        studentMobileNumber.add(234234233);
        studentMobileNumber.add(1234321234);
        System.out.println(studentMobileNumber.get(2));
        for(Integer in:studentMobileNumber){
            System.out.println("Student mobile numbers are "+in);
        }
        System.out.println("====================Removing Value=========================");
        studentMobileNumber.remove(1);
        for(Integer in:studentMobileNumber){
            System.out.println("Student mobile numbers are "+in);
        }
        System.out.println("=============================================");
        ArrayList<String> names = new ArrayList<>();
        names.add("Jhon");
        names.add("Joe");
        names.add("Tyree");
        names.add("Will");
        //System.out.println("name is "+names.get(2));
        //System.out.println(names.size());
        System.out.println("Names are: "+ names);

    }
}
