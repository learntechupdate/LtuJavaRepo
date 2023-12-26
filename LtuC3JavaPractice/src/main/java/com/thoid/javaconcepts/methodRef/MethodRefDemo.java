package com.thoid.javaconcepts.methodRef;

import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {

    public static void printSq(int x){
        System.out.println(x*x);
    }

    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(2,3,4,5);
        al.forEach(MethodRefDemo::printSq);

        /*
        //or
        for(Integer i : al){
        printSq(i);
        }
         */
    }
}
