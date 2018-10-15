package com.scp.test;

public class StaticOverLoadAndOverride 
{
	public static void main(String[] args) {
		B obj=new B();
		obj.methodA();
	}

}
class A
{
	public static void methodA()
	{
		System.out.println("Static A");
	}
	public static void methodA2(int i)
	{
		System.out.println("Static A2");
	}
}
class B extends A
{
	public static void methodA()
	{
		System.out.println("Static A - Over-ridden");
	}
	public static void methodA2(String i)
	{
		System.out.println("Static A2");
	}
}

