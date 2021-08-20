package datastrutureandalgorithm.array;

public class LearnArrayWithMethod {

    public static void main(String args[]) {

        int[] numbers = {12, 39, 34, 293, 98};
        // int [] rollNumbers={67,82,1,9};
        LearnArrayWithMethod.checkMinimum(numbers);
        //LearnArrayWithMethod.checkMinimum(rollNumbers);
        LearnArrayWithMethod.checkMaximum(numbers);
    }

    static void checkMinimum(int[] num) {  // To find the minimum value from an array
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Minimum value : " +min);
    }


    static void checkMaximum(int[] num) {  // To find the maximum value from an array
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("Maximum value: "+max);

    }

    static int[] getArray() {
        return new int[]{45, 76, 84, 23, 46};
    }
}