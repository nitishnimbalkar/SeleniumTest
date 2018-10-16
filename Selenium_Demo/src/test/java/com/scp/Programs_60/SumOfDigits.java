package com.scp.Programs_60;

public class SumOfDigits {

	public static void main(String[] args) 
	{
//		Sum(123);
		SumRecursion(124);

	}
	
	public static void Sum(Integer number) 
	{
		int sum=0;
		while(number!=0)
		{
			sum+=number%10;
			number/=10;
		}
		System.out.println("Sum  is : "+sum);
	}
	
	public static void SumRecursion(Integer number) 
	{
		System.out.println("Sum  is : "+Recursion(number));
	}
	
	public static Integer Recursion(Integer number) 
	{
		if(number/10==0) 
		{
			return number;
		}
		else
		{
			return number%10 + Recursion(number/10);
		}
	}
}
