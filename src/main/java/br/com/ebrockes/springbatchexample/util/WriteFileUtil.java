package br.com.ebrockes.springbatchexample.util;

public class WriteFileUtil {


	public static void main(String[] args) throws Exception {
		 String fileName = System.getProperty("user.home")+"/student.csv";
         
	        System.out.println("Write CSV file:");
	        CsvFileWriter.writeCsvFile(fileName);
	}

}