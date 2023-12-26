package com.thoidpractice.programs.groupingarray.fail;

import java.util.Arrays;

/*
negative in left
posting in right
 */
public class GroupingArrayXfail {

    public static void main(String[] args) {
        int[] array={2,1,-3,-6,-2,0,-53,52,67,73,-73};
        groupingArray(array);
    }

    public static void groupingArray(int[] array){
        int intital=0;
        int last=array.length-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0){
                array[last]=array[i];
                last--;
            }
            else if(array[i]<0) {
                array[intital]=array[i];
                intital++;
            }
        }

        System.out.println(Arrays.toString(array));

    }


}
