package com.scp.Programs_60;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown 
{
	public static void main(String[] args) throws Exception 
	{
		String driverLocation="E:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverLocation);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		Thread.sleep(500);
		
		List<WebElement> drop = driver.findElements(By.xpath("//ul/li/div/div[2]"));
		
		for (WebElement webElement : drop) 
		{
			//System.out.println(webElement.getText());
			if (webElement.getText().equalsIgnoreCase("selenium interview questions")) 
			{
				webElement.click();
				break;
			}			
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}

class Emp
{
  void method()
	{
		System.out.println("Private method");
	}
 
 void method2()
	{
	 	Emp empz=new Emp();
	 	empz.method();
	 	this.method();
		System.out.println("Private method");
	}
 
}


class Emp2
{
 void method()
	{
	 	Emp empz=new Emp();
	 	empz.method();
		System.out.println("Private method");
	}
}







