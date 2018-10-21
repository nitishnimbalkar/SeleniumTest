package com.scp.Programs_60;

public class NumberConversion_Binary_Octal_Hexa 
{
	public static void DecimalBinary(int number) 
	{
		int variableNumber=number;
		String binary="";
		int rem;
		
		while(variableNumber>0)
		{
			rem=variableNumber%2;
			binary=rem+binary;
			variableNumber/=2;
		}
		System.out.println("Decimal - "+number+" : Binary - "+binary);
	}
	public static void DecimalOcta(int number) 
	{
		int variableNumber=number;
		String octal="";
		int rem;
		
		while(variableNumber>0)
		{
			rem=variableNumber%8;
			octal=rem+octal;
			variableNumber/=8;
		}
		System.out.println("Decimal - "+number+" : Octal - "+octal);
	}
	public static void DecimalHexa(int number) 
	{
		int variableNumber=number;
		String Hexa="";
		int rem;
		char[] hexNumber= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(variableNumber>0)
		{
			rem=variableNumber%16;
			Hexa= hexNumber[rem]+Hexa;
			variableNumber/=16;
		}
		System.out.println("Decimal - "+number+" : Hexa - "+Hexa);
	}
	
	public static void main(String[] args) 
	{
		DecimalBinary(200);
		DecimalOcta(200);
		DecimalHexa(200);
	}
}
