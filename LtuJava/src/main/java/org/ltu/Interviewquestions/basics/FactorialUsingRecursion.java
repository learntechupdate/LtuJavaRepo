package Interviewquestions.basics;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	public static int fact(int n) 
	{
		if(n==0)
		{
			return 1;
		}
		
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


