package com.scp.Programs_60;

import java.util.HashMap;

public class DuplicateCharactersInString {

	public static void main(String[] args) 
	{
		String str="How to find duplicate characters in a string in java?";
//		DuplicateWithHashMap(str);
		DuplicateWithHashMapModified(str);
	}
	
	public static void DuplicateWithHashMap(String str)
	{
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for (Character ch : str.toCharArray()) 
		{
			if(Character.isWhitespace(ch))
			{
				continue;
			}
			else
			{
				if(charMap.containsKey(ch))
				{
					charMap.put(ch, charMap.get(ch)+1);
				}
				else
				{
					charMap.put(ch, 1);
				}
			}
		}
		System.out.println(charMap);
	}
	
	public static void DuplicateWithHashMapModified(String str)
	{
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		str=str.replaceAll(" ", "");
		for (Character ch : str.toCharArray()) 
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
	}
}
