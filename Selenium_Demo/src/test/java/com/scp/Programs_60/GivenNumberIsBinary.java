package com.scp.Programs_60;

public class GivenNumberIsBinary 
{
	public static void main(String[] args) {
		int number = 1000101;
		//BinaryCheck(number);
		BinaryCheckAlternative(number);
	}

	public static void BinaryCheck(Number num) 
	{
		//issue if binary number starts with 0 - 0100 etc.
		if(num.toString().matches("[0|1]*"))
		{
			System.out.println("Binary");
		}
		else
		{
			System.out.println("Not Binary");
		}
	}
	
	public static void BinaryCheckAlternative(Number num) 
	{
		if(num.toString().replaceAll("[0-1]*", "").equals(""))
		{
			System.out.println("Binary Number");
		}
		else
		{
			System.out.println("Not Binary Number");
		}
	}
}
