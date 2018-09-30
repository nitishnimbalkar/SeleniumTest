package com.scp.scoopen.Selenium_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateTOOLSQA 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driverInstance=new FirefoxDriver();
		driverInstance.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement firstNameField = driverInstance.findElement(By.name("firstname"));
		WebElement lastNameField = driverInstance.findElement(By.name("lastname"));
		List<WebElement> genderRadioButton = driverInstance.findElements(By.name("sex"));
		List<WebElement> experienceRadioButton = driverInstance.findElements(By.name("exp"));
		WebElement dateField = driverInstance.findElement(By.id("datepicker"));
		List<WebElement> professionCheckBox = driverInstance.findElements(By.name("profession"));
		List<WebElement> toolsCheckBox = driverInstance.findElements(By.name("tool"));
		WebElement continantsSingleDropDown = driverInstance.findElement(By.id("continents"));
		WebElement commandsSingleDropDown = driverInstance.findElement(By.id("selenium_commands"));
		
		firstNameField.sendKeys("TEsetNAme");
		lastNameField.sendKeys("LAstName");
		dateField.sendKeys("19-12-1992");
		
		for (WebElement gender : genderRadioButton) 
		{
			if(gender.getAttribute("value").toLowerCase().equals("male"))
				gender.click();
			
		}
		
		for (WebElement experience : experienceRadioButton) 
			if(experience.getAttribute("value").equals("4"))
				experience.click();
		
		for (WebElement profession : professionCheckBox) 
			profession.click();
		
		for (WebElement tools : toolsCheckBox) 
		{
			if(tools.getAttribute("value").equals("Selenium IDE"))
				tools.click();
			else if(tools.getAttribute("value").equals("Selenium Webdriver"))
				tools.click();
		}

		Select contDropDown=new Select(continantsSingleDropDown);
		contDropDown.selectByVisibleText("Africa");
		
		Select comdDropDown=new Select(commandsSingleDropDown);
		comdDropDown.selectByVisibleText("Navigation Commands");
		comdDropDown.selectByVisibleText("WebElement Commands");
				
		Thread.sleep(10000);
		driverInstance.close();

	}

}
