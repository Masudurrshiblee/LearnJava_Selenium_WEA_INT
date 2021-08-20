package datastrutureandalgorithm.array;

public class Learn3DArray {

   static String [][][] pizza=new String[2][3][3];

    public static void main(String[] args) {
        Learn3DArray.pizza[0][0][0]="SL";
        Learn3DArray.pizza[0][0][1]="Name";
        Learn3DArray.pizza[0][0][2]="Price";

        Learn3DArray.pizza[0][1][0]="101";
        Learn3DArray.pizza[0][1][1]="Regular";
        Learn3DArray.pizza[0][1][2]="15.00";

        Learn3DArray.pizza[0][2][0]="102";
        Learn3DArray.pizza[0][2][1]="Cheese";
        Learn3DArray.pizza[0][2][2]="20.00";

        Learn3DArray.pizza[1][0][0]="103";
        Learn3DArray.pizza[1][0][1]="Chicken";
        Learn3DArray.pizza[1][0][2]="25.00";

        Learn3DArray.pizza[1][1][0]="104";
        Learn3DArray.pizza[1][1][1]="vage";
        Learn3DArray.pizza[1][1][2]="26.00";

        Learn3DArray.pizza[1][2][0]="105";
        Learn3DArray.pizza[1][2][1]="Broccoli";
        Learn3DArray.pizza[1][2][2]="27.00";

        for(String pizz[][]:pizza){
            for(String piz[]:pizz){
                for(String pi:piz){
                    System.out.print(pi+"    ");
                }
                System.out.println();

            }
          //  System.out.println(); This print line will show different console
        }


    }
}
