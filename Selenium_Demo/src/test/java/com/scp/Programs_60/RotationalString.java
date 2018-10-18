package com.scp.Programs_60;

public class RotationalString 
{
	public static void main(String[] args) 
	{
		String s1="nitish";
		String s2="tishnit";
		RotationalStringCheck(s1, s2);
	}
	public static void RotationalStringCheck(String s1,String s2) 
	{
		if(s1.length()!=s2.length())
		{
			System.out.println("String is not Rotational");
			return;
		}
		String s3=s1+s1;
		if(s3.contains(s2))
		{
			System.out.println("String is Rotational");
		}
		else
		{
			System.out.println("String is not Rotational");
		}
	}
}
