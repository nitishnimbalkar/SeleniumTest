package com.scp.scoopen.Selenium_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.java.selenium.FlashWebDriver;

public class FlashTest 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.ie.driver","E:\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		FlashWebDriver flashdriver=new FlashWebDriver(driver, "myFlashMovie");
		driver.get("http://demo.guru99.com/test/flash-testing.html");
		Thread.sleep(5000);		
		flashdriver.callFlashObject("Play");			
	  	Thread.sleep(5000);		
	  	flashdriver.callFlashObject("StopPlay");			
		Thread.sleep(5000);		
		flashdriver.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
	    System.out.println(flashdriver.callFlashObject("GetVariable","/:message"));
	    driver.close();
	}

}
