package com.scp.Programs_60;

public class ContinuousSubArraySum 
{
	public static void main(String[] args) 
	{
		int[] array={8, 8, 31, 9, 8, 8};
		//SubArray(array, 16);
		findSubArray(array, 16);
	}
	
	public static void SubArray(int[] array, int number) 
	{
		int start = 0;
		int sum = array[0];
		
		for (int i = 1; i < array.length; i++) 
		{
			
			sum = sum + array[i];
			
			while(sum > number && start <=i-1)
			{
				sum = sum - array[start];
				start++;
			}
			
			if(sum == number)
			{
				for (int j = start; j <=i ; j++) 
				{
					System.out.print(array[j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	static void findSubArray(int[] inputArray, int inputNumber)
    {
		int sum = 0;
        for (int i = 0; i < inputArray.length; i++)
        {
            sum = inputArray[i];
 
            for (int j = i+1; j < inputArray.length; j++)
            {
                sum = sum + inputArray[j];
                if(sum == inputNumber)
                {
                    for (int k = i; k <= j; k++)
                    {
                        System.out.print(inputArray[k]+" ");
                    }
                    System.out.println();
                }
                else if (sum < inputNumber)
                {
                    continue;
                }
                else if (sum > inputNumber)
                {
                    break;
                }
            }
        }
    }
}
