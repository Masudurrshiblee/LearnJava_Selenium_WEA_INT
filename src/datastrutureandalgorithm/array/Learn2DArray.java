package datastrutureandalgorithm.array;

public class Learn2DArray {
    // It is called 2 dimensional array or array of array or multidimensional array
    // In 2 dimensional array first dimension is for row and 2nd dimension is for column
    public static void main(String[] args) {
        String [][]stName=new String[4][4];// Declaring an array and array name is stName, Here length of row is 5
        // length of column is 4.
System.out.println(stName.length);
        // assigning value in array
        stName[0][0]="101";
        stName[0][1]="Will";
        stName[0][2]="Pom";
        stName[0][3]="Phila,PA";

        stName[1][0]="102";
        stName[1][1]="Md";
        stName[1][2]="Haque";
        stName[1][3]="Bristol,PA";

        stName[2][0]="103";
        stName[2][1]="Md";
        stName[2][2]="Hossen";
        stName[2][3]="Bensalem,PA";

        stName[3][0]="104";
        stName[3][1]="Sam";
        stName[3][2]="Perez";
        stName[3][3]="treavose,PA";

        // Use try catch exception
        try{
            stName[4][0]="104";
            stName[4][1]="Rob";
            stName[4][2]="Nelson";
            stName[4][3]="South Phila,PA";
        }catch(Exception e){
            System.out.println("Array index out of bound exception");
        }

// To retrieve data from one row and one column
System.out.println("Student name is " + stName[3][1]);
// To retrieve all values from the table Learn2DArray

        // using Parent and child for each loop
        for(String stn[]:stName){   // Converting 2D to 1D

            for(String st:stn){
//System.out.println("Student details : "+st);
                // If we use only print then it show organize way
                System.out.print(st +"   ");
            }
            System.out.println();
        }
        System.out.println(carInfo[0][3]); // Calling an static array which is declared at the bottom
        // and find the value from the table
    }
    // Declaring and assigning value in 2D array
    public static String [][] carInfo={
            {"carBrand","carModel","carPrice","carYear"},// Assigning value in first row
            {"Bmw","Q33","90000","2021"},// assigning value in 2nd row
            {"Audi","GT22","75000","2022"}  // Assigning value in 3rd row
    };
}
