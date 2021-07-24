public class RemoveString {
 public  static void main (String args[]){
     String sampleString = "i Love java, not";
     sampleString = sampleString.replaceAll("not","").replaceAll(",",".");
     System.out.println("After remove : "+ sampleString);
     sampleString="@po56bg34k";
     // Removing alphabet
     sampleString=sampleString.replaceAll("[a-zA-z]","");
     System.out.println("Removing only alphabet: "+ sampleString);
     // removing Number by using shift+6 in same code
     sampleString = sampleString.replaceAll("[^a-zA-Z]", "");
     System.out.println("Removing number: "+ sampleString);
     //Removing letters and numbers
     sampleString = sampleString.replaceAll("[a-zA-Z0-9]", "");
     System.out.println("Removing letters and number: "+ sampleString);
     // Removing Symbol
     sampleString = sampleString.replaceAll("[^a-zA-Z0-9]", "");
     System.out.println("Removing Symbol: "+ sampleString);
 }
}
