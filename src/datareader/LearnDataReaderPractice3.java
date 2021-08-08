package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReaderPractice3 {

    public static void main(String args[]) throws IOException {
LearnDataReaderPractice3.readData();
    }

    public static void readData() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String filePath = "C:\\Users\\mrshi\\eclipse-workspace\\LearnJava_Selenium_WEA_INT\\DataTest\\Sample2.txt";
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException e) {

            System.out.println("File not found Exception");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("File already closed");
            }


        }
    }
}
