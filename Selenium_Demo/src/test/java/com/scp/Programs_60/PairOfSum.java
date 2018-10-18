package com.scp.Programs_60;

import java.util.Arrays;

public class PairOfSum 
{
	public static void main(String[] args) 
	{
		int[] array= {4, 5, 7, 11, 9, 13, 8, 12};
		//PairAndSumWithLoop(array, 20);
		findThePairs(array, 20);
	}
	
	public static void PairAndSumWithLoop(int[] array,int number) 
	{
		for (int i = 0; i < array.length-1; i++) 
		{
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i]+array[j]==number)
				{
					System.out.println("Pair ("+array[i]+","+array[j]+")");
				}
			}
		}
	}
	
	public static void findThePairs(int[] inputArray,int inputNumber) 
	{
        Arrays.sort(inputArray);
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
        int i = 0;
        int j = inputArray.length-1;
        while (i < j)
        {
            if(inputArray[i]+inputArray[j] == inputNumber)
            {
            	System.out.println("Pair ("+inputArray[i]+","+inputArray[j]+")");
                i++;
                j--;
            }
            else if (inputArray[i]+inputArray[j] < inputNumber)
            {
                i++;
            }
            else if (inputArray[i]+inputArray[j] > inputNumber)
            {
                j--;
            }
        }      
	}
}

