package com.scp.scoopen.Selenium_Demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxTest 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception 
	{
		File fp=new File("C:\\Users\\Nitish\\Desktop\\Testing\\Sending_resume.txt");
		FileReader fr=new FileReader(fp);
		BufferedReader br=new BufferedReader(fr);
		
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.freetextbox.com/demos/");
		
		WebElement textField=driver.findElement(By.id("ctl00_MainContent_FreeTextBox1_designEditor"));
		textField.sendKeys(" ");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);

		
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_DELETE);
		
		String Line;
		while((Line=br.readLine())!=null)
		{
			textField.sendKeys(Line);
		}
		
		File fileP= new File("C:\\Users\\Nitish\\Desktop\\Testing\\OutPut.png");
		TakesScreenshot srcT=(TakesScreenshot) driver;
		FileHandler.copy(srcT.getScreenshotAs(OutputType.FILE), fileP);
		Thread.sleep(5000);
		driver.close();
	}

}
