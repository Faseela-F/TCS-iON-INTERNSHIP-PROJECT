package com.phptravels.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;
	
	public static String getCustomerCellData(int RowNum, int ColNum) throws IOException {
		
		FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
                + "/CustomerTestData.xlsx");

   	 excelWBook = new XSSFWorkbook(ExcelFile);
        excelWSheet = excelWBook.getSheetAt(0);
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
		
	}
	
	public static String getAgentCellData(int RowNum, int ColNum) throws IOException {
        
       
    	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
                 + "/AgentTestData.xlsx");

    	 excelWBook = new XSSFWorkbook(ExcelFile);
         excelWSheet = excelWBook.getSheetAt(0);
         DataFormatter formatter = new DataFormatter();
         return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
         
     }
 
	public static String getSupplierCellData(int RowNum, int ColNum) throws IOException {
     
     
 	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
              + "/SupplierTestData.xlsx");

 	 excelWBook = new XSSFWorkbook(ExcelFile);
      excelWSheet = excelWBook.getSheetAt(0);
      DataFormatter formatter = new DataFormatter();
      return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
      
  }
 
	public static String getAdminCellData(int RowNum, int ColNum) throws IOException {
     
     
 	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
              + "/AdminTestData.xlsx");

 	 excelWBook = new XSSFWorkbook(ExcelFile);
      excelWSheet = excelWBook.getSheetAt(0);
      DataFormatter formatter = new DataFormatter();
      return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
      
  }

}
