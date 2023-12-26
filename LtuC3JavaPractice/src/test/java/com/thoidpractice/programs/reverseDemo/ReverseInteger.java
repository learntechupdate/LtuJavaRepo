package com.thoidpractice.programs.reverseDemo;

/*
124 divided by 10 equals
12 with a remainder of 4

 */
public class ReverseInteger {

    public static int  revInt(int n){

        if(n<0){
            throw new IllegalArgumentException("please enter postive input");
        }

        if(n/10<0){
           return n;
        }

        int rem=0;
        int value=n;
        String op="";

        while (value>0){
            rem=value%10;
            value=value/10;
            op+=rem;
        }

        return Integer.parseInt(op);
    }

    public static void main(String[] args) {
        System.out.println(revInt(124));
    }
}
