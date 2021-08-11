package datareader;
// During learning data reader we need to create a sample text file under any project
// Right click on project, then click directory and put directory name and then hit enter
// Then right click on directory and then click file , put file name and then hit enter.
// Absolute path: Full path
// Relative path: partial path
// How to get path: select project+ right click then right click on copy and then click on copy path
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReader {

    public static void main(String args[]) throws IOException {
        FileReader filereader = null;
        BufferedReader bufferedReader = null;
        String filePath = "C:\\Users\\mrshi\\eclipse-workspace\\LearnJava_Selenium_WEA_INT\\DataTest\\Sample.txt";
        try {
            filereader = new FileReader(filePath);
            bufferedReader = new BufferedReader(filereader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        }finally {
          try{
              filereader.close();
              bufferedReader.close();
          }catch (Exception e){
System.out.println("File already closed");
          }
        }


    }

}
