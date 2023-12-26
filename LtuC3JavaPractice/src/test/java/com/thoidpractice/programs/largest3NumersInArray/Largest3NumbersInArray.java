package com.thoidpractice.programs.largest3NumersInArray;

import java.util.Arrays;

public class Largest3NumbersInArray {

    public static int[] largest3NumbersInArray(int[] inputArray){

        Arrays.sort(inputArray);

        int[] output=new int[3];

        int outputIndex=0;

        for (int i = inputArray.length-1; i >0 ; i--) {
            if(outputIndex==3){
                break;
            }
            output[outputIndex]=inputArray[i];
            outputIndex++;
        }
        /*for(int values: output){
            System.out.println(values);
        }*/
        return output ;
    }

    public static void main(String[] args) {

        int[] array={4,1,3,6,8,15,2,1,63};

        int[] largest3fromarray = largest3NumbersInArray(array);

        System.out.println(Arrays.toString(largest3fromarray));
    }
}
