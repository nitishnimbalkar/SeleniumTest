package com.scp.Programs_60;

public class ReverseString {

	public static void main(String[] args) {
		String str= "This is new String to test New methods";
		//System.out.println(reverseMethodStringArray(str));
		System.out.println(reverseMethodRecersivecall(str));
	}
	public static String reverseMethodStringBuffer(String str)
	{
		StringBuffer br=new StringBuffer(str);
		return br.reverse().toString();
	}
	
	public static String reverseMethodStringArray(String str)
	{
		char[] c=str.toCharArray();
		str="";
		for(int i=c.length-1;i>=0;i--)
		{
			str+=c[i];
		}
		return str;
	}
	public static String reverseMethodRecersivecall(String str)
	{
		if(str.length()==1||str.length()==0)
		{
			System.out.println(str.length()+" "+str);
			return str;
		}
		return str.charAt(str.length()-1)
				+reverseMethodRecersivecall(str.substring(1, str.length()-1))
				+str.charAt(0);
	}
	
}
