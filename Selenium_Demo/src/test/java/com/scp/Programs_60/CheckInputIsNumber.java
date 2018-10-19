package com.scp.Programs_60;

public class CheckInputIsNumber 
{
	public static void main(String[] args) 
	{	
		System.out.println("Result : "+CheckIfNumber("123"));
	}
	
	public static boolean CheckIfNumber(String number)
	{
		try
		{
			Integer.parseInt(number);
		}
		catch(NumberFormatException e)
		{
			return false;
		}	
		return true;
	}
	
	public static boolean CheckIfNumber2(String number)
	{
		return number.replaceAll("[0-9]*", "").length()==0;
	}
}
