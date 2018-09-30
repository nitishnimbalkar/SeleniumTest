package com.scp.TestFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel 
{
	public static void main(String[] args) throws Exception 
	{
		String URL="C:\\Users\\Nitish\\Desktop\\Testing\\TestFile.xlsx";
		File file=new File(URL);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rows=sheet.iterator();
		
		while(rows.hasNext())
		{
			XSSFRow row=(XSSFRow)rows.next();
			String userName;
			String passWord;
			String message;
//			String result;
			try 
			{
				userName=row.getCell(1).getStringCellValue();
			} catch (NullPointerException e) {userName="";}
			try 
			{
				passWord=row.getCell(2).getStringCellValue();
			} catch (NullPointerException e) {passWord="";}
			try 
			{
				message=row.getCell(3).getStringCellValue();
			} catch (NullPointerException e) {message="";}
//			try 
//			{
//				result=row.getCell(4).getStringCellValue();
//			} catch (NullPointerException e) {result="";}
			
			if(userName.equals("Username")&&passWord.equals("Password")&&message.equals("Message"))
			{
				continue;
			}
			if(message.equals(OrangeGRlogin.OrangeHRLoginResponse(userName, passWord)))
			{
				try 
				{row.getCell(4).setCellValue("PASS");} 
				catch (NullPointerException e) 
				{row.createCell(4).setCellValue("PASS");}
			}
			else
			{
				try 
				{row.getCell(4).setCellValue("FAIL");} 
				catch (NullPointerException e) 
				{row.createCell(4).setCellValue("FAIL");}
			}
		} // End of while loop
		fis.close();
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}
}
