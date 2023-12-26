package com.thoidpractice.programs.maxnumber;

import java.util.Arrays;

public class MaxNumber2 {

    public static void main(String[] args) {
        int[] numbers = {35, 68, 29, 23};
        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];

        System.out.println("Maximum number" + max);
    }
}
