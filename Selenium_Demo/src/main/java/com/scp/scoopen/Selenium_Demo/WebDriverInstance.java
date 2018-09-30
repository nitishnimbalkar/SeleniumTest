package com.scp.scoopen.Selenium_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInstance 
{
	private static WebDriver driver;
	public static WebDriver getWebDriverInstance()
	{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		return driver;
	}
	public static void closeWebDriverInstance()
	{
		if(driver!=null) 
		driver.close();
	}
}
