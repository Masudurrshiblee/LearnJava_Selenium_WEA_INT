package datastrutureandalgorithm.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifference {

    public static void main(String args[]){
         int num1[]={2,4,7,45,87,89,23,45};
         int num2[]={2,7,45,67,35,204,65};

        Set<Integer> number1=new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{2,4,7,45,87,89,23,45}));
        Set<Integer> number2=new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{2,7,45,67,35,204,65}));

        // To do union
        Set<Integer> union=new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two number is "+union);

        // Do intersection
        Set<Integer> intersection=new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of two numbers is "+intersection);

        // To do Symetric Difference
        Set<Integer> difference=new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two number is "+difference);
    }
}
