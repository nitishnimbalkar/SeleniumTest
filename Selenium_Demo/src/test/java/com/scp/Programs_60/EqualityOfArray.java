package com.scp.Programs_60;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		Integer[] arr1= {1,2,3,4,5};
		Integer[] arr2= {1,2,3,5,4};
//		EqualityOfArrayMethod(arr1, arr2);
//		EqualityOfArrayItteration(arr1, arr2);\
		EqualityOfArrayMethodDeep(arr1, arr2);
	}
	
	public static void EqualityOfArrayMethod(Integer[] arr1,Integer[] arr2)
	{
		System.out.println(
				Arrays.equals(arr1, arr2)
				?"Arrays are Equal"
				:"Arrays are not Equal"
				);
	}
	
	public static void EqualityOfArrayMethodDeep(Integer[] arr1,Integer[] arr2)
	{
		//Deep Equals is for MultiDimension array
		System.out.println(
				Arrays.deepEquals(arr1, arr2)
				?"Arrays are Equal"
				:"Arrays are not Equal"
				);
	}
	
	public static void EqualityOfArrayItteration(Integer[] arr1,Integer[] arr2)
	{
		boolean equalStatus = true;
		
		if(arr1.length == arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
				if(arr1[i]!=arr2[i])
				{
					equalStatus = false;
				}
		}
		else
		{
			equalStatus = false;
		}
		System.out.println(equalStatus
		?"Arrays are Equal"
		:"Arrays are not Equal");
	}

}
