package com.thoidpractice.programs.largestNumberInArray;

public class LargestNumberInArray
{

    public static int largestNumberInArray(int[] inputArray){

//        int maxnum=Integer.MIN_VALUE;
        int maxnum=inputArray[0];

        for(int number: inputArray){
            if(number>maxnum){
                maxnum=number;
            }
        }

        return maxnum;

    }


    public static void main(String[] args) {
        int[] array={4,1,3,6,8};
        System.out.println(largestNumberInArray(array));
    }
}
