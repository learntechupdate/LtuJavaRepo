package com.thoidProgamsBestcode;

import java.util.Map;
import java.util.TreeMap;


public class RemoveDuplicateAndCountOccurrenceUsingMap {


    public static void removeDuplicateUsingMap(int[] arrayInput) {
        // Create a TreeMap to store elements as keys and their counts as values.
        Map<Integer, Integer> map = new TreeMap<>();

        // Iterate through the input array to process elements.
        for (int num : arrayInput) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        System.out.println("Non-duplicate elements: ");
        for (int a : map.keySet()) {
            System.out.print(a + " ");
        }
        System.out.println("");
        System.out.println("Number : occurrence => " + map);

        System.out.println("Printing only duplicate values and their occurrences:");

        for (int value : map.keySet()) {
            if (map.get(value) >= 2) {
                System.out.println("Number " + value + ": occurred => " + map.get(value));
            }
        }
    }


    public static void main(String[] args) {
        // Sample input array with duplicate elements.
        int[] array = {5, 3, 2, 1, 5, 3, 16, 72, 16, 17, 17, 19, 16};

        // Call the removeDuplicateUsingMap function to process the input array.
        removeDuplicateUsingMap(array);
    }
}
