package com.scp.Programs_60;

public class MoveZeroesInArray 
{
	public static void moveZeroToBack(int[] array)
	{
		
		int counter=0;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]!=0)
			{
				array[counter]=array[i];
				counter++;
			}
		}
		while(counter<array.length)
		{
			array[counter]=0;
			counter++;
		}
		displayArreyContents(array);
	}
	
	public static void moveZeroToFront(int[] array)
	{
		
		int counter=array.length-1;
		
		for (int i = array.length-1; i >= 0; i--) 
		{
			if(array[i]!=0)
			{
				array[counter]=array[i];
				counter--;	
			}
		}
		while(counter>=0)
		{
			array[counter]=0;
			counter--;
		}
		displayArreyContents(array);
	}
	
	public static void displayArreyContents(int[] array) 
	{
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
	
	public static void main(String[] args) 
	{
		int[] array= {-1,0,4,3,0,-8};
		moveZeroToBack(array);
		moveZeroToFront(array);
		
	}
}
