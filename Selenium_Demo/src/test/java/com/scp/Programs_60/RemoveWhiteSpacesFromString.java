package com.scp.Programs_60;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) 
	{
		String str="String from which white spaces are to be removed";
//		System.out.println(removeWhiteSpacesReplaceAll(str));
//		System.out.println(removeWhiteSpacesRecersiveCall(str));
//		System.out.println(removeWhiteSpacesSplit(str));
//		System.out.println(removeWhiteSpacesWithCharacter(str));
		System.out.println(removeWhiteSpacesReplace(str));
	}
	
	public static String removeWhiteSpacesReplaceAll(String str)
	{
		str=str.replaceAll(" ", "");
		return str;
	}
	
	public static String removeWhiteSpacesRecersiveCall(String str)
	{
		if(str.contains(" "))
		{
			str=removeWhiteSpacesRecersiveCall(str.replaceFirst(" ", ""));
			return str;
		}
		else
		{
			return str;	
		}
	}
	
	public static String removeWhiteSpacesSplit(String str)
	{
		String[] words=str.split(" ");
		str="";
		for (String word : words) {
			str+=word;
		}
		return str;
	}

	public static String removeWhiteSpacesWithCharacter(String str)
	{
		String strTemp="";
		for (Character ch : str.toCharArray()) 
		{
			if(!Character.isWhitespace(ch))
			{
				strTemp+=ch;
			}
		}
		return strTemp;
	}
	
	public static String removeWhiteSpacesReplace(String str)
	{
		str=str.replace(" ", "");
		return str;
	}
}
