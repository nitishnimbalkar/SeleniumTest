package com.scp.scoopen.Selenium_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(10000);
		driver.close();
	}
}
