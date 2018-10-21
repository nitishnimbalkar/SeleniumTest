package com.scp.Programs_60;

public class LeaderInIntegerArray 
{
	public static void main(String[] args) 
	{
		int[] array= {0,19,2,15,2,9,7,0,14,9,11,7,8,5,3,-1};
		//LeadersCheck(array);
		LeadersCheck2(array);
	}
	
	public static void LeadersCheck(int[] array) 
	{
		boolean found=false;
		int index=-1;
		for (int i = 0; i < array.length; i++) 
		{
			index=i;
			for (int j = i+1; j < array.length; j++) 
			{
				if(i==j)
				{
					continue;
				}
				if(array[j]>array[j-1])
				{
					break;
				}
				if(j==array.length-1)
				{
					found=true;
					break;
				}
			}
			if(found)
			{
				break;
			}
		}
		displayArreyContents(array, index);
	}
	
	public static void LeadersCheck2(int[] array) 
	{
		int count=-1;
		for (int i = 0; i < array.length; i++)
		{
			boolean found=true;
			for (int j = i+1; j < array.length; j++) 
			{
				if(j==i)
				{
					continue;
				}
				if(array[i]<array[j])
				{
					found=false;
					break;
				}
			}
			if(found==true)
			{
				if(count==-1)
				{
					System.out.print("{");
				}
				count++;
				if(i==array.length-1)
				{
					System.out.println(array[i]+"}");
				}
				else
				{
					System.out.print(array[i]+",");
				}
			}
		}
	}
	
	public static void displayArreyContents(int[] array, int index) 
	{
		System.out.print("{");
		for (int i = index; i < array.length; i++) 
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
}
