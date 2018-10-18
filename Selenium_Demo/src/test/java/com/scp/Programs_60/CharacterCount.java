package com.scp.Programs_60;

import java.util.HashMap;

public class CharacterCount 
{
	public static void main(String[] args) 
	{
		String str="Java J2EE Java JSP J2EE";
//		characterCountHashMap(str);
		characterCount(str);
		
	}
	public static void characterCountHashMap(String str) 
	{
		char[] character=str.replaceAll(" ","").toCharArray();
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		for (char ch : character) 
		{
			charMap.put(ch, (charMap.containsKey(ch)?charMap.get(ch):0)+1);
		}
		
		for (char ch : charMap.keySet())
		{
			System.out.println("Character '"+ch+"' has count - "+charMap.get(ch));
		}
	}
	
	public static void characterCount(String str) 
	{
		for (char i = 'A'; i <='z'; i++) 
		{
			int count=0;
			for (int j = 0; j < str.length()-1; j++) 
			{
				if(str.charAt(j)==i)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println("Character '"+i+"' has count - "+count);
			}
		}
		
	}
}
