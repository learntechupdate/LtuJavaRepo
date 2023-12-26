package com.thoidpractice.programs.recression;

import java.util.Scanner;

public class FactorialUsingRecursion {
//	5*4*3*2*1=120
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		//n*(fun(n-1)*(fun(n-2))*...*1)
		//4*(3*(2*(1)))
		return (n*fact(n-1));	
		}

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println("Factorical of "+n+"! is "+fact(n));
		scn.close();
	}
}


