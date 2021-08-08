package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReaderPractise1 {
    public static void main(String args[]) throws IOException {
        FileReader fileReader=null;
        BufferedReader bufferReader=null;
        String filePath="DataTest/Sample1.txt";
        try{
            fileReader=new FileReader(filePath);
            bufferReader=new BufferedReader(fileReader);
            String data;
            while( (data= bufferReader.readLine()) !=null){
                System.out.println(data);

            }
        }catch (Exception e){
            System.out.println("File not found exception");

        }finally{
            try{
                fileReader.close();
                bufferReader.close();
            }catch(Exception e){
                System.out.println("File already close");
            }
        }

    }
}
