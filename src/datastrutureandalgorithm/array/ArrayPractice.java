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

        arraypractice.stBatch[0]="Jill";
        arraypractice.stBatch[1]="hill";
        arraypractice.stBatch[2]="lill";
        arraypractice.stBatch[3]="till";
        arraypractice.stBatch[4]="mill";
        arraypractice.stBatch[5]="gill";
        arraypractice.stBatch[6]="pill";
        // To print one index
        System.out.println(arraypractice.stBatch[5]);
        //To print all index
        for(String j: arraypractice.stBatch) {
            System.out.println("j");
        }
        arraypractice.tuitionFee[0]=5000.5;
        arraypractice.tuitionFee[1]=6000.5;
        arraypractice.tuitionFee[2]=7000.5;
        arraypractice.tuitionFee[3]=8000.5;
        arraypractice.tuitionFee[3]=9000.5;
       // arraypractice.tuitionFee[4]=4000.5;
        // By using for each loop printing all the index
        for(double d: arraypractice.tuitionFee){
            System.out.println(d);
        }
    }
}
