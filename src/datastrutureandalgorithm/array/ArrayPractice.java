package datastrutureandalgorithm.array;

public class ArrayPractice {


    // declaring an array
    int [] stId=new int[5];
    String [] stBatch=new String[7];
    double [] tuitionFee=new double[4];

    public static void main(String[] args) {
        // Creating an object
        ArrayPractice arraypractice=new ArrayPractice();
        // assigning value for int variable
        arraypractice.stId[0]=10;
        arraypractice.stId[1]=20;
        arraypractice.stId[2]=25;
        arraypractice.stId[3]=30;
        arraypractice.stId[4]=40;
        System.out.println(arraypractice.stId[2]);// it will print stId for index 2.
        // For retrieve all stId we need to use for loop
        for(int i=0; i<arraypractice.stId.length; i++){
            System.out.println(arraypractice.stId[i]);
        }
    }
}
