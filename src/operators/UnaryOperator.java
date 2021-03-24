package operators;

public class UnaryOperator {
    //Increment operator: ++ always add 1
    //preIncrement operator : ++number
    //postIncrement operator: number++

    //Decrement operator: --number
    //preDecrement operator: --number
    //postDecrement operator: number--
    public static void main(String[] args){
        int x =10;
        System.out.println(++x);// This print of line will add 1 while executing and it will
                                // print 11
        System.out.println(x++);// This print line will print 11 because it post increment and 1
                                // will be added in next line
        System.out.println(x); // this print line will print 12 because this is next line of
                                // postIncrement
        System.out.println(--x); // This print line will print 11 because -1 + 12(from previous line)
        System.out.println(x--); // This line will print 11 because -1 will not be added while executing
        System.out.println(x);   // This line will print 10 because -1+11( from previous line)
    }
}
