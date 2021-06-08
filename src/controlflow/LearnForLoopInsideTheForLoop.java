package controlflow;

public class LearnForLoopInsideTheForLoop {
    public static void main(String args[] ){
        for(int i=0; i<=5; i=i+1){
            System.out.println("Hello world");
            for(int j=0; j<=5; j=j+1){
                System.out.println("Learning For Loop");
            }
        }
    }

}
