package com.scp.Programs_60;

public class TrigonometricValues 
{
	public static void main(String[] args) 
	{
		double Angle=180;
		TrignoValue(Angle);
	}
	
	public static void TrignoValue(double AngleInRadian)
	{
		if(AngleInRadian < 0 || AngleInRadian > 360)
		{
			System.out.println("Cannot Compute Trigonometric Values");
			return;
		}
		
		System.out.println("Sin("+AngleInRadian+") : "+Math.sin(AngleInRadian));
		System.out.println("Cos("+AngleInRadian+") : "+Math.cos(AngleInRadian));
		System.out.println("Tan("+AngleInRadian+") : "+Math.tan(AngleInRadian));
		System.out.println("Sec("+AngleInRadian+") : "+1/Math.sin(AngleInRadian));
		System.out.println("Cosec("+AngleInRadian+") : "+1/Math.cos(AngleInRadian));
		System.out.println("Cot("+AngleInRadian+") : "+1/Math.tan(AngleInRadian));
		
	}
}
