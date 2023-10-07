package Interviewquestions.basics;

import java.util.Scanner;

public class Fibonacci 
{
 public static void printFibonacci(int n)
 {
	 	  
	  int[] fib=new int[n];
	  fib[0]=0;
	  fib[1]=1;
	  
	  for(int i = 2;i<n;i++)
	  {
		  fib[i]=fib[i-1]+fib[i-2];
	  }
	  System.out.println("Fibonacci series upto "+n+" is");
	  for(int i=0;i<n;i++)
	  {
		   System.out.print(fib[i]+" ");
	  }
 }
 
 public static void main(String[] args) 
 {
	 System.out.println("Enter number upto which Fibonacci series is required");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		printFibonacci(n);
		scn.close();
 }
}
