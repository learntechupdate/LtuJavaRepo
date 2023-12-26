package com.thoidpractice.programs.Factorial;

public class FactorialOfNumber {

    public static void factoricalOfNumber(int n){
        int fact=1;
        for (int index = 0; index <n ; index++) {

            fact*=(n-index);
//            fact=fact*(n-index);
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {

        factoricalOfNumber(5);
    }
}
