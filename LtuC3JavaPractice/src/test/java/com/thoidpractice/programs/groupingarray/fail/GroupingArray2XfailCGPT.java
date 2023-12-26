package com.thoidpractice.programs.groupingarray.fail;

import java.util.Arrays;

public class GroupingArray2XfailCGPT {
    public static void main(String[] args) {
        int[] array = {2, 1, -3, -6, -2, 0, -53, 53, 67, 73};
        groupingArray(array);
    }

    public static void groupingArray(int[] array) {
        int initial = 0;
        int last = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                array[initial] = array[i];
                initial++;
            }
        }

        // Fill the remaining positions with positive values
        for (int i = initial; i <= last; i++) {
            array[i] = Math.abs(array[i]);
        }

        System.out.println(Arrays.toString(array));
    }
}
