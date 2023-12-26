package com.thoidProgamsBestcode;

public class PrimeNumber {

    public static String checkPrime(int n){

        int remCount=0;

        if(n==0||n==1){
            return "Please enter number greater than 1";
        }else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    remCount++;
                }
            }
        }

        if (remCount>0){
            return n+" is Not an prime number";
        }
        else
            return n+" is prime number";

    }

    public static void main(String[] args) {

        System.out.println(checkPrime(6));
    }
}