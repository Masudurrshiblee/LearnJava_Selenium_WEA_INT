public class LearnString {
    // String is data type
    //String is class
    //Sting is a class
    public static void main(String args[]){
        String food="Briyani";
        System.out.println(food.length());
        System.out.println(food.charAt(2));
        System.out.println(food.chars());
        System.out.println(food.equals("briyani"));
        System.out.println(food.substring(5));
        System.out.println(food.contains("p"));
        System.out.println(food.trim());
        for(int i=food.length()-1; i>=0; i--){
            System.out.println("food.length");
        }

        // How to concat two variables
        String stId="1001";
        String stName=" James";
        System.out.println(stId.concat(stName));
    }


}
