public class ReverseString {
    // It is very very important for interview

    public static void main(String args[]){
      String inputString="shiblee";
     char[] chars=inputString.toCharArray();
     int length=chars.length;
     // System.out.println("length is"+ length);
      for(int i=length-1; i>=0; i--){
          System.out.print(chars[i]);
      }
        System.out.println("reverseWord");
      // 2nd Method
        String reverseWord="PNT";
      for(int i=length-1; i>=0; i--){
          reverseWord = reverseWord + inputString.charAt(i);
          System.out.println();
      }

      // 3rd method using built in method in java
        StringBuffer stringBuffer= new StringBuffer(inputString);
      System.out.println(stringBuffer.reverse());

      // 4th Method
        System.out.println("\n................");
        StringBuilder stringBuilder = new StringBuilder();
       System.out.println(stringBuilder.reverse());

        }

    }

