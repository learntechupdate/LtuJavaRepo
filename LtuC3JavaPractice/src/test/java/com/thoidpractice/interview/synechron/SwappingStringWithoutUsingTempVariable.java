package com.thoidpractice.interview.synechron;

/*
String a="abc"
     String b="xyz"
 */
public class SwappingStringWithoutUsingTempVariable {

    public static void main(String[] args) {

        String a="abc";
        String b="xyz";
        System.out.println("Before swapping => value of a : "+a+" value of b : "+b);

        a=b+","+a;
        b= a.split(",")[1];
        a=a.split(",")[0];

        System.out.println("After  swapping => value of a : "+a+" value of b : "+b);

    }
}

/*
public static void swapping()
{
	String a="abc"
     String b="xyz"

	 a=b+" "+a;//xyz abc


}
 */