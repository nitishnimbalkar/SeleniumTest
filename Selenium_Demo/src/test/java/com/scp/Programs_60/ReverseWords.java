package com.scp.Programs_60;

public class ReverseWords 
{
	public static void main(String[] args) 
	{
		String sentense="Java Concept Of The Day";
		System.out.println(sentense);
		System.out.println(ReverseWordsInSentense(sentense));
	}
	
	public static String ReverseWordsInSentense(String sentense)
	{
		String returnString="";
		for ( String word : sentense.split(" ")) 
		{
			returnString+=" "+Reverse(word);
		}	
		
		return returnString.replaceFirst(" ", "");
	}
	
	
	public static String Reverse(String word)
	{
		StringBuffer sb=new StringBuffer(word);
		return sb.reverse().toString();
	}
}
