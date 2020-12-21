package com.lti;

public class Calc 
{
	public static int add(int n1,int n2)
	{
		return n1+n2;
	}
	
	public static int sub(int n1,int n2)
	{
		return n1-n2;
	}
	public static int mul(int n1,int n2)
	{
		return n1*n2;
	}
	
	public static void main(String args[])
	{
		System.out.println("Addition is : "+add(10,20));
		System.out.println("Subtraction is : "+sub(40,20));
		System.out.println("multipliction is : "+mul(40,20));
	}
}
