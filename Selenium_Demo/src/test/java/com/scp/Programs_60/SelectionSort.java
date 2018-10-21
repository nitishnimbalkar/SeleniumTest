package com.scp.Programs_60;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] array= {45, 84, 101, 62, 12, 45};
		sortWithSelectionSort(array);
	}
	
	public static void sortWithSelectionSort(int[] array)
	{
		int location;
		int temp;
		for (int i = 0; i < array.length; i++) 
		{
			location=i;
			for (int j = i; j < array.length; j++) 
			{
				if(j==i)
				{
					continue;
				}
				if(array[j]>array[location])
				{
					location=j;
				}
			}
			 temp=array[i];
			 array[i]=array[location];
			 array[location]=temp;
		}
		diaplayArray(array);
		
	}
	public static void diaplayArray(int[] array) 
	{
		System.out.println("Array :");
		System.out.print("{");
		for (int i = 0; i < array.length; i++) 
		{
			if(i!=array.length-1) 
			{
				System.out.print(array[i]+",");
			}
			else
			{
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
	}
}
