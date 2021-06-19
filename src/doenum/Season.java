package doenum;

public enum Season {
    WINTER,SUMMER,SPRING,FALL
}
class ExampleOfSeason{   //Here Enum is outside of a class and here we not use public the reason is not a file
    public static void main(String args[]) {
        Season S=Season.SUMMER;
        System.out.println("S"); // This is one way
        System.out.println(Season.SPRING);  // This is another way
        System.out.println(Direction.EAST);

    }

}
enum Direction{
    EAST,WEST, NORTH, SOUTH}  // Enum in outside of enum class
