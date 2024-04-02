package com.thoidpractice.programs.Fibnociiseris;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibnociseries {

    public static void fibnocisericer(int n){

        int[] fib=new int[n];
        fib[0]=0;
        fib[1]=1;

        for (int i = 2; i <fib.length ; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }

        System.out.println(Arrays.toString(fib));

    }

    public static void main(String[] args) {
        fibnocisericer(10);
    }
}
