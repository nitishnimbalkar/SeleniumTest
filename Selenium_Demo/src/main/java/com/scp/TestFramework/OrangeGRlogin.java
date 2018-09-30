package com.scp.TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeGRlogin 
{
	private static String URL;
	private static final String driverLocation="E:\\\\geckodriver-v0.21.0-win64\\\\geckodriver.exe";
	private static WebDriver driver ;
	
	private static WebElement userTextBox;
	private static WebElement pwdTextBox;
	private static WebElement logInButton;
	private static WebElement Message;
	
	public static String OrangeHRLoginResponse(String userName,String password)
	{
		URL="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver",driverLocation);
		driver = new FirefoxDriver();
		driver.get(URL);
		
		userTextBox=driver.findElement(By.id("txtUsername"));
		userTextBox.sendKeys(userName);
		
		pwdTextBox=driver.findElement(By.id("txtPassword"));
		pwdTextBox.sendKeys(password);
		
		logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();
		
		try 
		{Message=driver.findElement(By.id("spanMessage"));} 
		catch (NoSuchElementException e) {Message=driver.findElement(By.id("welcome"));}
		
		String output=Message.getText();
		driver.close();
		return output;
	}
}
