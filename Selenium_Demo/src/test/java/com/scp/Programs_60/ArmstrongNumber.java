package com.scp.Programs_60;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		//ArmstrongCheck(9474);
		//ArmstrongRecursive((long)370);
		
		for(long i=0;i<=1000000;i++)
		{
			ArmstrongRecursive(i);
		}
	}

	public static void ArmstrongCheck(Integer number) 
	{
		Integer ArmstrongSum=0;
		Integer v_number=number;
		while(v_number!=0)
		{
			ArmstrongSum+=(int) Math.pow(v_number%10, number.toString().length());
			v_number=v_number/10;
		}
		if(ArmstrongSum.intValue()==number.intValue())
		{
			System.out.println("Armstrong Number "+ArmstrongSum);
		}
//		else 
//		{
//			System.out.println("Not an Armstrong umber");
//		}
	}
	
	public static void ArmstrongRecursive(Long number) 
	{		
		if(number.longValue()==Recursive(number,number.toString().length()))
			System.out.println("Armstrong Number"+number);
//		else 
//			System.out.println("Not an Armstrong Number");
	}
	
	public static Long Recursive(Long number,Integer power) 
	{
		if(number==0||number==1)
		{
			return number;
		}
		return (long) (Math.pow(number%10, power)+ Recursive(number/10,power)); 
	}
}
