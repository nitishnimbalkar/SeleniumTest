package com.scp.Programs_60;

public class PyramidNumbers {

	public static void main(String[] args) {
		Integer number=9;
		pyramidPattern2Reverse(number);
		pyramidPattern1(number);
		pyramidPattern2(number);
		pyramidPattern3(number);
		pyramidPattern4(number);
		pyramidPattern5(number);
		pyramidPattern6(number);
		
	}
	
	
	public static void pyramidPattern1(Integer number)
	{
		for(int i=number ; i>=1 ; i--)
		{
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j= number-i+1;j>=1;j--)
			{
				System.out.print(number-i+1+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pyramidPattern2(Integer number)
	{
		for(int i=number ; i>=1 ; i--)
		{
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j= 1;j<=number-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void pyramidPattern2Reverse(Integer number)
	{
		for(int i=number ; i>=1 ; i--)
		{
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j= number-i+1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void pyramidPattern3(Integer number)
	{
		for(int i=number ; i>=1 ; i--)
		{
			for(int j=i-1 ; j>=1 ; j--)
			{
				System.out.print(" ");
			}
			for(int j=number-i ; j>=0 ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void pyramidPattern4(Integer number)
	{
		for(int i=number ; i>=1 ; i--)
		{
			for(int j=i-1 ; j>=1 ; j--)
			{
				System.out.print("  ");
			}
			
			for(int j=1 ; j<number-i+1 ; j++)
			{
				System.out.print(j+" ");
			}
			
			for(int j=number-i+1 ; j>=1 ; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pyramidPattern5(Integer number)
	{
		for(int i=number ; i>=1 ; i--)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1 ; j>=1 ; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			for(int j=number-i+1 ; j>=1 ; j--)
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	public static void pyramidPattern6(Integer number)
	{
		for(int i=number ; i>=1 ; i--)
		{
			for(int j=1 ; j<i ; j++)
			{
				System.out.print("  ");
			}
			for(int j=i ; j<=number ; j++)
			{
				System.out.print(j+" ");
			}
			for(int j=number-1 ; j>i-1 ; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();		
		}
		System.out.println();
	}
}
