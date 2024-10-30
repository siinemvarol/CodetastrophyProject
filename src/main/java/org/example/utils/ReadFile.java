package org.example.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    //method defined for reading a String cell
    public String readStringCellData(String fileName, int vRow, int vColumn)
    {
        //variable for storing the cell value
        String value=null;
        //initialize Workbook null
        Workbook wb=null;
        try
        {
            //reading data from a file in the form of bytes
            FileInputStream fis=new FileInputStream(fileName);
            //constructs an XSSFWorkbook object, by buffering the whole stream into the memory
            wb=new XSSFWorkbook(fis);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        //getting the XSSFSheet object at given index
        Sheet sheet=wb.getSheetAt(0);
        //returns the logical row
        Row row=sheet.getRow(vRow);
        //getting the cell representing the given column
        Cell cell=row.getCell(vColumn);
        //getting cell value
        value=cell.getStringCellValue();
        //returns the cell value
        return value;
    }

    //method defined for reading a numeric cell
    public int readNumericCellData(String fileName, int vRow, int vColumn)
    {
        //variable for storing the cell value
        double value;
        //initialize Workbook null
        Workbook wb=null;
        try
        {
            //reading data from a file in the form of bytes
            FileInputStream fis=new FileInputStream(fileName);
            //constructs an XSSFWorkbook object, by buffering the whole stream into the memory
            wb=new XSSFWorkbook(fis);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        //getting the XSSFSheet object at given index
        Sheet sheet=wb.getSheetAt(0);
        //returns the logical row
        Row row=sheet.getRow(vRow);
        //getting the cell representing the given column
        Cell cell=row.getCell(vColumn);
        //getting cell value
        value=cell.getNumericCellValue();
        //returns the cell value
        return (int) value;
    }
}
