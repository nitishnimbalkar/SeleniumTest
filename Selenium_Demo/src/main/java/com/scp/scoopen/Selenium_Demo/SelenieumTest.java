package com.scp.scoopen.Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelenieumTest {

	public static void main(String[] args) throws Exception 
	{

//		WebDriver driver=WebDriverInstance.getWebDriverInstance();
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.sendKeys("Selenium demo");
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.submit();
		Thread.sleep(10000);
//		WebDriverInstance.closeWebDriverInstance();
		driver.close();
		
	}

}
