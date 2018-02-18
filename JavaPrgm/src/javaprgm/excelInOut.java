/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;


import java.io.*;
import java.util.*;

 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
 
/**
 * A dirty simple program that reads an Excel file.
 * @author www.codejava.net
 *
 */
public class excelInOut{
     
    public static void main(String[] args) throws IOException {
        String path =  "C:\\Users\\Ekam\\Desktop\\test.xlsx ";
        FileInputStream fileInput = new FileInputStream(new File(path));
        XSSFWorkbook workbookIn = new XSSFWorkbook(fileInput);
        XSSFSheet sheetIn = workbookIn.getSheetAt(0);
        XSSFWorkbook workbookOut = new XSSFWorkbook();
        XSSFSheet sheetOut = workbookOut.createSheet(path.substring(path.lastIndexOf("\\")+1));
        
        Iterator<Row> iterator = sheetIn.iterator();
        int rowCount=-1;
        while(iterator.hasNext())
        {
            Row nextRow = iterator.next();
            Row rowOut = sheetOut.createRow(++rowCount);
            
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            int columnCount=nextRow.getFirstCellNum()-1;
            //System.out.println(columnCount);
           
            // cellOut = rowOut.createCell(++columnCount);
            //cellOut.setCellValue(rowCount+1);
             //System.out.println(rowCount+" "+columnCount);
            while(cellIterator.hasNext())
            {
//                if(columnCount == 0)
//                {
//                     //System.out.println("\t"+columnCount);
//                     columnCount++;
//                }
//                else
                {
                    Cell cellIn = cellIterator.next();
                    Cell cellOut = rowOut.createCell(++columnCount);
                    switch(cellIn.getCellType())
                    {
                        case Cell.CELL_TYPE_STRING :
                            cellOut.setCellValue(cellIn.getStringCellValue());
                            break;
                        case Cell.CELL_TYPE_BOOLEAN :
                            cellOut.setCellValue(cellIn.getBooleanCellValue());
                            break;
                        case Cell.CELL_TYPE_NUMERIC :
                            cellOut.setCellValue(cellIn.getNumericCellValue());
                        break;
                    }
                    //System.out.println("\t\t"+columnCount);
                    //columnCount++;
                }
            }
        }
        
        Object[][] bookData = {
            {"yo","hi",21},
            {"Hey","how",23},
            {"Ok","R U",25},
        };
        
        for(Object[] aBook : bookData)
        {
            Row row = sheetOut.createRow(++rowCount);
            int columnCount =-1;
            
            Cell cellOut = row.createCell(++columnCount);
            cellOut.setCellValue(rowCount+1);
            for(Object field : aBook)
            {
                cellOut = row.createCell(++columnCount);
                if(field instanceof String)
                {
                    cellOut.setCellValue((String) field);
                }
                else if(field instanceof Integer)
                {
                    cellOut.setCellValue((Integer) field);
                }                
            }
        }
        
        try(FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Ekam\\Desktop\\test.xlsx "))
        {
            workbookOut.write(outputStream);
            workbookOut.close();
            workbookIn.close();
        }
    }
 
}