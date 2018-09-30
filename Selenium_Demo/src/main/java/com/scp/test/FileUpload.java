package com.scp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload 
{
	private static final String driverLocation="E:\\geckodriver-v0.21.0-win64\\geckodriver.exe";
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver",driverLocation);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\TestFileC.xlsx");
		driver.findElement(By.id("terms")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
