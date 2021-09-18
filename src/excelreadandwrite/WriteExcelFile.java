/*package excelreadandwrite;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    // FilePath
    public static final String FILE_PATH="../LearnJava_Selenium_WEA_INT/DataTest/SampleExcelFile.xlxs";
    public static void main(String []args) throws IOException {
Object [][] stDetails={
        {"S/N","First_Name","Last_Name","Address"},
        {"001","jonathon","wilson","Philadelphia,USA" },
        {"002","Joe","Thomas","NY,USA"}
};
WriteExcelFile.writeExcel(FILE_PATH,"sheetName",stDetails);
    }
    public static void writeExcel(String filePath, String sheetName,Object[][] data) throws IOException {
        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet sheet=wb.createSheet(sheetName);

        int rowNum=0;
        System.out.println("Excel File created");
        for(Object [] dt:data){
            XSSFRow row = sheet.createRow(rowNum++);
            int colNum=0;
            for(Object field:dt){
                XSSFCell cell= row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue(Boolean.parseBoolean((String) field));
                }else if(field instanceof Boolean){
                    cell.setCellValue((Boolean) field);

                }
            }
        }
        try{
            FileOutputStream outStream=new FileOutputStream(filePath);
            wb.write(outStream);
            wb.close();
        }catch(FileNotFoundException fn){
            System.out.println("File not found Exception");
        }catch(IOException io){
            System.out.println("Done");
        }

    }
}*/
