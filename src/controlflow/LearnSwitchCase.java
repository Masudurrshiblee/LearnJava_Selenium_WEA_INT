package controlflow;

public class LearnSwitchCase {
    public static void main(String[]args){

        int foodSerial=3;
        String foodName;

        switch(foodSerial){
            case 1:
            foodName="Burger";
            break;
            case 2:
                foodName ="Briyani";
                break;
            case 3:
                foodName="Pizza";
                break;
            case 4:
                foodName="Coffee";
                break;
            default:
                foodName= "Unavailable";
                break;
        }
        System.out.println("Food name is "+foodName);
    }
}
