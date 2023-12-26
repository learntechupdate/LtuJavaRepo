package com.thoidpractice.programs.Maxtop3number;

import java.util.Arrays;

class LargestOf3NumbersInanArray {


    public static void main(String[] args) {

        int[] arrayValue={2,4,76,25,67,87,34};
        Arrays.sort(arrayValue);

        System.out.println("sorted"+Arrays.toString(arrayValue));

        for (int i=0;i<3;i++){
            int i1 = arrayValue[arrayValue.length - 1 - i];
            System.out.print(i1+" ");
        }
    }

    public int[] last3maxvalues(int[] input){
        return input;
    }

}
