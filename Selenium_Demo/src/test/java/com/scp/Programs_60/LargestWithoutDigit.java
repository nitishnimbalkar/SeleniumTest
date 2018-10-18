package com.scp.Programs_60;

public class LargestWithoutDigit 
{
	public static void main(String[] args) 
	{
		SecondLargestWithoutDigit(-1, -2);
	}

	public static void SecondLargestWithoutDigit(Integer number, Integer digit) 
	{
		System.out.println(number.toString().contains(digit.toString()));
		do 
		{
			number=number-1;
		
			if(!number.toString().contains(digit.toString()))
			{
				System.out.println("Required Number is : "+number);
				break;
			}
		}
		while(true);
	}
}
