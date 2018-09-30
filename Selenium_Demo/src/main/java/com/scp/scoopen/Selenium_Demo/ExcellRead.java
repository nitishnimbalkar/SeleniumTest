package com.scp.scoopen.Selenium_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellRead 
{
	public static void main(String[] args) throws Exception 
	{
		File file=new File("C:\\Users\\Nitish\\Desktop\\Testing\\TestFile.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wrokbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet= wrokbook.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
		
		Iterator<Row> rows=sheet.rowIterator();
		while(rows.hasNext())
		{
			row=(XSSFRow) rows.next();
			Iterator<Cell> cells=row.iterator();
			while(cells.hasNext())
			{
				cell=(XSSFCell) cells.next();
				if(cell.getCellTypeEnum()==CellType.STRING)
				{
					System.out.println(cell.getStringCellValue());
					cell.setCellValue("NITISH Stint");
				}
				else if (cell.getCellTypeEnum()==CellType.NUMERIC) 
				{
					System.out.println(cell.getNumericCellValue());
				}
			}	
		}
		fis.close();
		wrokbook.write(new FileOutputStream(file));
	}
}
