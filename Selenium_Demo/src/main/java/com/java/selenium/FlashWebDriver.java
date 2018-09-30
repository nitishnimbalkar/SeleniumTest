package com.java.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FlashWebDriver 
{
	private final WebDriver webdriver; 
	private final String flashObjectId ;
	public FlashWebDriver(final WebDriver webdriver,final String  flashObjectId)   
	{
		this.webdriver=webdriver;
		this.flashObjectId=flashObjectId;
	}
	public String click(final String objectId,final String buttonLabel)
	{
		return callFlashObject("DoFlashClick",objectId,buttonLabel);
	}
	public String click(final String objectId)
	{
		return callFlashObject(objectId,"");
	}

	 public String callFlashObject(final String functionName,final String... args)
	{
		final Object result=((JavascriptExecutor)  webdriver).executeScript(makeJsFuntion(functionName,args), new Object[0]);
		return result!=null ? result.toString() :null;
	}

	private String makeJsFuntion(final String functionName,final String... args)      
	{
		final StringBuffer functionArgs=new StringBuffer();
		if(args.length>0)
	    {
			for(int i=0;i<args.length;i++)
			{
				if(i>0)
				{
					functionArgs.append(",");
				}
				functionArgs.append(String.format("'%1$s'", args[i]));
			}
	    }
		return String.format("return document.%1$s.%2$s(%3$s);", flashObjectId, functionName,functionArgs);
	}
}
