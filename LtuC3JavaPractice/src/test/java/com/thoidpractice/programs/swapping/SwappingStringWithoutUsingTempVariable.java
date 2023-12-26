package com.thoidpractice.programs.swapping;

/*
String a="abc"
     String b="xyz"
 */
public class SwappingStringWithoutUsingTempVariable {

    public static void main(String[] args) {
        String a="abc";
        String b="xyz";

        swapString(a,b);
    }

    /**
     *
     * @param a
     * @param b
     */
    public static void swapString(String a,String b){

        System.out.println("Before swapping => value of a : "+a+", value of b : "+b);
        a=b+","+a;
        b= a.split(",")[1];
        a=a.split(",")[0];
        System.out.println("After  swapping => value of a : "+a+", value of b : "+b);
    }
}

