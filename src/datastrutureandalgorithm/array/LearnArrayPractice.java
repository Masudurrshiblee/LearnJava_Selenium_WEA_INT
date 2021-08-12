package datastrutureandalgorithm.array;

public class LearnArrayPractice {

    // Declaring variable and assigning value
    int [] age={18,16,15,14,12,10};
    String [] collegeName={"RU","DU","CU","NYU"};
    double [] salary={500.6,600.5,900.8,500.9};

    public static void main(String[] args) {
        LearnArrayPractice learnArrayPractice=new LearnArrayPractice();
        System.out.println(learnArrayPractice.age[2]);
        // if we want to print all values of age variable using for loop
       // LearnArrayPractice learnarraypractice = null;
        for(int i = 0; i<learnArrayPractice.age.length; i++){
            System.out.println(learnArrayPractice.age[i]);

            // if we want to print all values of age variable using for each loop
            for(int a: learnArrayPractice.age){
              System.out.println(a);


            }
            System.out.println("******************** now String Variable");

            System.out.println(learnArrayPractice.collegeName[1]);

            // How do we retrieve all values for String variable using for each loop
            for(String coll:learnArrayPractice.collegeName){
                System.out.println(coll);
            }

        }
        System.out.println("################## for double variable");
        System.out.println(learnArrayPractice.salary[2]); // For retrieve single value
        // For retrieve all values
        for(double sa: learnArrayPractice.salary){
            System.out.println(sa);
        }
    }
}
