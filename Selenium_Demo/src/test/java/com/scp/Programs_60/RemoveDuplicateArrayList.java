package com.scp.Programs_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateArrayList 
{
	public static void main(String[] args) 
	{
		int[] array= {1,2,1,3,4,1};
		Arrays.sort(array);
		List<Integer> alist=new ArrayList<Integer>();
		for (int integer : array) 
		{
			alist.add(integer);
		}
		//RemoveDuplicate(alist);
		//RemoveDuplicate2(alist);
		RemoveDuplicateHashSet(alist);
	}
	
	public static void RemoveDuplicate(List<Integer> alist) 
	{
		System.out.println(alist);
		for (int i = alist.size()-1 ; i > 0 ; i--) 
		{
			if(alist.get(i).intValue()==alist.get(i-1).intValue())
			{
				alist.remove(i);
				continue;
			}
		}
		System.out.println(alist);
	}
	
	public static void RemoveDuplicate2(List<Integer> alist) 
	{
		System.out.println(alist);
		for (int i = alist.size()-1 ; i > 0 ; i--) 
		{
			for(int j = 0 ; j <= i-1 ; j++)
			{
				if(alist.get(i).intValue()==alist.get(j).intValue())
				{
					alist.remove(i);
					break;
				}
			}
		}
		System.out.println(alist);
	}
	
	public static void RemoveDuplicateHashSet(List<Integer> alist) 
	{
		System.out.println(alist);
		HashSet<Integer> set=new HashSet<>(alist);
		System.out.println(set);
	}
}
