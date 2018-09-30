package com.scp.scoopen.Selenium_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass 
{
	public static void main(String[] args) 
	{
		String str="Hello world";
		//System.out.println(str.toLowerCase().contains("Hello world".toLowerCase()));
		System.out.println(str.indexOf("Hello")==0);
//		System.setProperty("webdriver.gecko.driver","E:\\\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		String tagName = driver.findElement(By.id("email")).getText();
//		

	}

}
