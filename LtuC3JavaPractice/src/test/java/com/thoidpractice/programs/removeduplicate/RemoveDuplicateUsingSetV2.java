package com.thoidpractice.programs.removeduplicate;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSetV2 {


    public static int[] removeDuplicate(int[] array){

        Set<Integer> set=new HashSet<>();

        for (int i=0;i<array.length;i++){

            set.add(array[i]);
        }

       int[] NonDuplicateArray=new int[set.size()];
        int index=0;
        for(int values:set){
            NonDuplicateArray[index]=values;
            index++;
        }
        return NonDuplicateArray;
    }

    public static void main(String[] args) {
        int a[] = {5,2,6,8,6,7,5,2,8,6,9,17,0,0};
        int[] wihoutDuplicate = removeDuplicate(a);
        System.out.println(Arrays.toString(wihoutDuplicate));
    }
}
