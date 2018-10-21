package com.scp.Programs_60;

public class ReverseAddAndFindPalindrome 
{
	public static void main(String[] args) 
	{
//		long number=7325;
		long number=190;
		FindPalndrome(number);
	}
	
	public static void FindPalndrome(long number) 
	{
		long reverseNumber=-1;	
		do 
		{
			reverseNumber=Reverse(number);
			number+=reverseNumber;
			if(checkPalindrome(number))
			{
				break;
			}
		}while (number!=reverseNumber);
		System.out.println("palindrome number found - "+number);
	}
	
	public static long Reverse(long number) 
	{
		return Long.parseLong(new StringBuffer(""+number).reverse().toString());
	}
	
	public static boolean checkPalindrome(long number)
	{
		String vNumber=""+number;
		return vNumber.equals(new StringBuffer(vNumber).reverse().toString());
	}
}
