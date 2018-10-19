package com.scp.Programs_60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersection 
{
	public static void main(String[] args) 
	{
		int[] Array= {1,3,4,6,7,8};
		int[] Array2= {3,6,7,9};
		
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		
        //ArrayIntersectList(s1, s2);
		ArrayIntersectSet(s1, s2);
		ArrayIntersect(Array, Array2);
	}
	
	public static void ArrayIntersect(int[] array1, int[] array2)
	{
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = 0; j < array2.length; j++) 
			{
				if(array1[i]==array2[j])
				{
					System.out.println("Intersect value : "+array1[i]);
				}
			}
		}
	}
	
	
	public static void ArrayIntersectSet(Object[] array1, Object[] array2)
	{
		Set<Object> set1=returnSet(array1);
		Set<Object> set2=returnSet(array2);
		
		System.out.println(set1);
		System.out.println(set2);
		
		set1.retainAll(set2);
		System.out.println(set1);
		
	}
	private static Set<Object> returnSet(Object[] array)
	{
		Set<Object> set=new HashSet<Object>();
		for (Object obj : array) 
		{
			set.add(obj);
		}
		return set;
	}
	
	
	public static void ArrayIntersectList(Object[] array1, Object[] array2)
	{
		List<Object> lst1= returnList(array1);
		List<Object> lst2= returnList(array2);
		System.out.println(lst1);
		System.out.println(lst2);
		
		lst1.retainAll(lst2);
		System.out.println(lst1);
		
	}
	private static List<Object> returnList(Object[] array)
	{
		List<Object> list=new ArrayList<Object>();
		for (Object integer : array) 
		{
			list.add(integer);
		}
		return list;
	}
}
