package com.scp.Programs_60;

import java.util.Arrays;

public class AnagramFromString {

	public static void main(String[] args) {
		String str1="Mother In Law";
		String str2="Hitler Woman";
		AnagramCheckUsingMehods(str1, str2);
	}

	public static void AnagramCheckUsingMehods(String str1,String str2)
	{
		str1=str1.toLowerCase().replaceAll(" ", "");
		str2=str2.toLowerCase().replaceAll(" ", "");
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not an Anagram");
		}
		else
		{
			char[] ch1=str1.toCharArray();
			Arrays.sort(ch1);
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
		}
	}
}
