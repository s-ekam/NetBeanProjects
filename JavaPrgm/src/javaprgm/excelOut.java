/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;


import java.io.*;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
 
/**
 * A dirty simple program that reads an Excel file.
 * @author www.codejava.net
 *
 */
public class excelOut{
     
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Ekam\\Desktop\\test.xlsx ");
        XSSFSheet sheet = workbook.getSheet("test.xlsx ");
        
        Object[][] bookData = {
            {"yo","hlo",21},
            {"Hey","how",23},
            {"Ok","R U",25},
        };
        int rowCount = sheet.getLastRowNum();
        
        for(Object[] aBook : bookData)
        {
            Row row = sheet.createRow(++rowCount);
            int columnCount =-1;
            Cell cell = row.createCell(++columnCount);
            cell.setCellValue(rowCount);
            for(Object field : aBook)
            {
                
                cell = row.createCell(++columnCount);
                if(field instanceof String)
                {
                    cell.setCellValue((String) field);
                }
                else if(field instanceof Integer)
                {
                    cell.setCellValue((Integer) field);
                }                
            }
        }
        
        try(FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Ekam\\Desktop\\test.xlsx "))
        {
            workbook.write(outputStream);
        }
    }
 
}