package datastrutureandalgorithm.array;

public class LearnArray {
    //Declaring variable
    String name="abc";
    //String address;
    // Array is a container which hold similar types of data
    // Syntax of array
    //datatype [] variableName/arrayRefVar=new datatype[arraySize];
   static String [] stName=new String[4]; // Creating an array for static access modifier

    String [] address=new String[4];  // For non static access modifier

    public static void main(String[] args) {
        // Assigning value in array for static variable
        LearnArray.stName[0]="jack";
        LearnArray.stName[1]="jackob";
        LearnArray.stName[2]="jackon";
        LearnArray.stName[3]="jacks";
        // For non static variable we need to create an object and then assign value
        System.out.println(stName[2]);

        LearnArray learn=new LearnArray();
        learn.address[0]="NY";
        learn.address[1]="PA";
        learn.address[2]="NJ";
        learn.address[3]="VA";


System.out.println(learn.address[1] );
        //System.out.println(learn.address[5]);  if we print this line it will show ArrayIndexOutOfBoundException
        //Now we need to handle it
        try {
            learn.address[4] = "DC";
           System.out.println(learn.address[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound Exception");
        }
        }
    }


