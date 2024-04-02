package com.thoidpractice.programs.sorting;

import java.util.Arrays;

public class BubbleSortArray {

    public static void main(String[] args) {

        int[] input={6,5,75,34,61,4,65,12};

        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j <input.length ; j++) {
                /*if(i==j){
                    continue;
                }
                else if */
                if (input[i]>input[j]){
                    int temp;
                    temp=input[j] ;
                    input[j]=input[i] ;
                    input[i]=temp ;
                }
            }
        }

        for (int value:input) {
            System.out.println(value);
        }

        System.out.println(Arrays.toString(input));
    }
}
