package com.thoidpractice.programs.removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateUsingArrayList {

    public static int[] removeDuplicateArray(int[] array) {

        boolean count=false;

        for(int value:array){
            if(value==0){
                count=true;
            }
        }

        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (i == k) {
                    continue;//skiping iteration
                } else if (array[i] == array[k]) {
                    array[k] = 0;
                }
            }
        }
        

        List<Integer> removingZero=new ArrayList<>();

        for (int values : array){
            if(values!=0) {
                removingZero.add(values);
            }
        }

        if(count){
            removingZero.add(0);
        }

        int[] duplicateValuesRemovedArray=new int[removingZero.size()];
        int k=0;
        for(int value : removingZero){
            duplicateValuesRemovedArray[k]=value;
                    k++;
        }

        return duplicateValuesRemovedArray;

    }

    public static void main(String[] args)
        {
        int a[] = {5,2,6,8,6,0,7,5,2,8,6,9,17,0,0};
        removeDuplicateArray(a);
            System.out.println(Arrays.toString(removeDuplicateArray(a)));
    }

}

