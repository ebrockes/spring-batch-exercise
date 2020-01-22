package br.com.ebrockes.springbatchexample.util;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author ashraf
 * 
 */
public class CsvFileWriter {
     
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
     
    //CSV file header
    private static final String FILE_HEADER = "id,firstName,lastName,gender,age";
 
    public static void writeCsvFile(String fileName) {
         
         
        FileWriter fileWriter = null;
                 
        try {
            fileWriter = new FileWriter(fileName);
                          
            //Write a new student object list to the CSV file
            for (int i=0; i < 100000; i++) {
                fileWriter.append(new Teste().getText());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
 
            System.out.println("CSV file was created successfully !!!");
             
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
             
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
             
        }
    }
}