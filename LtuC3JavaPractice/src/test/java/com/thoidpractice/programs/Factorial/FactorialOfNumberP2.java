package com.thoidpractice.programs.Factorial;

public class FactorialOfNumberP2 {

    public static int getFactorialOfNumber(int n){

        int fact=1;
        if(n==0||n==1){
            return fact;
        }
        for (int i = n; i >0 ; i--) {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n=0;
        System.out.println(n+"! is "+getFactorialOfNumber(n));
    }
}
