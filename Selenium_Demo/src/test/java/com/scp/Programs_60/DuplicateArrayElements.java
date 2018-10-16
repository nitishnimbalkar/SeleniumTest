package com.scp.Programs_60;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateArrayElements {

	public static void main(String[] args) 
	{	
		Object[] obj= {"ONE","TWO","THREE","TWO","THREE"};
		Object[] obj2= {1,2,3,2,2};
//		DuplicateElementsUsinSET(obj);
//		DuplicateElementsUsinLOOP(obj2);
		DuplicateElementsUsinMAP(obj);
		DuplicateElementsUsinMAP(obj2);
	}
	
	public static void DuplicateElementsUsinSET(Object[] array) 
	{
		HashSet<Object> objectHash=new HashSet<>();
		for (Object object : array) 
		{
			if(objectHash.contains(object))
			{
				System.out.println("Duplicate : "+object);
			}
			else
			{
				objectHash.add(object);
			}
		}
	}
	
	public static void DuplicateElementsUsinLOOP(Object[] array)
	{
		if(array==null)
		{
			System.out.println("No Elements Available in array");
		}
		for(int i=0;i<=array.length-1;i++)
		{
			for (int j = 1; j < array.length && j!=i; j++) 
			{
				if(array[i].equals(array[j]))
				{
					System.out.println("Duplicate element : "+array[i]);
					break;
				}
			}
		}
	}
	
	public static void DuplicateElementsUsinMAP(Object[] array)
	{
		if(array==null)
		{
			System.out.println("No Elements Available in array");
		}
		
		HashMap<Object, Integer> objectMap= new HashMap<Object, Integer>();
		for (Object object : array) 
		{
			if(!objectMap.containsKey(object))
			{
				objectMap.put(object, 1);
			}
			else
			{
				objectMap.put(object, objectMap.get(object)+1);
				
			}
		}
		for (Object object : objectMap.keySet()) 
		{
			if(objectMap.get(object)!=1)
			{
				System.out.println("Duplicate Object : "+object+" , Occurance : "+objectMap.get(object));
			}
		}
	}
}
