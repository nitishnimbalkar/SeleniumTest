package com.scp.Programs_60;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) 
	{
		Integer[] array= {0,10,1,4,6,9,2};
		Integer[] array1=new Integer[1];
		SecondLargest(array);
		SecondLargestUsingUtilities(array1);
	}

	public static void SecondLargest(Integer[] array) 
	{
		if(array[0]==null||array[1]==null)
		{
			System.out.println("Not Enough Elements");
			return;
		}
		
		Integer max=null;
		Integer req=null;
		for (int i = 0; i < array.length-1; i++) 
		{
			if(array[i].intValue()==array[i+1].intValue())
			{
				continue;
			}
			
			if(max==null && req==null)
			{
				if(array[i]>array[i+1])
				{
					max=array[i];
					req=array[i+1];
					continue;
				}
				else
				{
					req=array[i];
					max=array[i+1];
					continue;
				}
			}
			
			if(array[i]>req && array[i]!=max)
			{
				req=array[i];
				if(req>max)
				{
					req=req+max;
					max=req-max;
					req=req-max;
				}
			}
		}
		
		System.out.println("Second Largest No : "+ req);
		
	}
	
	public static void SecondLargestUsingUtilities(Integer[] array) 
	{
		if(array[0]==null||array[1]==null)
		{
			System.out.println("Not Enough Elements");
			return;
		}
		
		Arrays.sort(array);
		System.out.println("Second largest Number is "+array[array.length-2]);
	}
}
