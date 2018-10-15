package com.scp.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM 
{
	private static String URL;
	private static final String driverLocation="E:\\\\geckodriver-v0.21.0-win64\\\\geckodriver.exe";
	private static WebDriver driver ;
	public static void main(String[] args) throws Exception
	{
		URL="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver",driverLocation);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
//		Wait refWait=new FluentWait(driver)
//				.pollingEvery(2, TimeUnit.SECONDS)
//				.withTimeout(10, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
//		
//		refWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		WebElement userTextBox=driver.findElement(By.id("txtUsername"));
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 3px solid red;');", userTextBox);
		userTextBox.sendKeys("Nitish");
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
