package com.thoidpractice.programs.primeNumber;

/*
number divided  n/2 to  n/n-1 if reminder=0 then it is prime,reminder >1 it is NonPrime Number
Ex.n=9 divide from 2 to 8 : by divisible by 3 : their fore 9 is Not prime
Ex.n=7 divide form 2 to 6 : No divisible by any number : therefore 7 is prime
 */
public class PrimeNumber {

    public static String checkPrime(int n){

        if(n==0||n==1){
            return "Please enter number greater than 1";
        }

        int remCount=0;

        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                remCount++;
            }

        }

        if (remCount>0){
            return n+" is Not an prime number";
        }
        else
            return n+" is prime number";

    }

    public static void main(String[] args) {

        System.out.println(checkPrime(2));
    }
}
