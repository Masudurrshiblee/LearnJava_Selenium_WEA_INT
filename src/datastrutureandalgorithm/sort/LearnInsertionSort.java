package datastrutureandalgorithm.sort;

public class LearnInsertionSort {

    public static void main(String args[]) {

        //Insertion sort
        int[] number = {34, 56, 23, 78, 3, 6, 8, 9}; // This is an interview question they through this type of array
        // and they will get the answer {3,6,8,9,23,34,56,78}
        for (int i = 0; i < number.length; i++) {
            int j = i - 1;
            int point = number[i];
            while (j >= 0 && number[j] > point) {
                number[j + 1] = number[j];
                j = j - 1;
            }
            number[j + 1] = point;
        }
        for (int n = 0; n < number.length; n++) {
            System.out.print(number[n]+" ");
        }
    }
}