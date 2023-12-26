package com.thoidpractice.programs.countduplicateoccurance;

import java.util.Map;
import java.util.TreeMap;


/**
 * This class provides a method for removing duplicate elements from an integer array using a Map data structure.
 */

public class CountDuplicatesInArrayUsingMapV3ChatGPTFormated {

    /**
     * Removes duplicate elements from the given integer array and prints the counts of each element.
     *
     * @param arrayInput The input integer array from which duplicates are to be removed.
     * @return void
     */
    public static void  removeDuplicateUsingMap(int[] arrayInput) {

        // Create a TreeMap to store elements as keys and their counts as values.
        Map<Integer, Integer> map = new TreeMap<>();

        // Iterate through the input array to process elements.
        for (int num : arrayInput) {
            // Check if the element is already in the map.
            if (!map.containsKey(num)) {
                // If not, add it to the map with a count of 1.
                map.put(num, 1);
            }
            else {
                // If it exists, increment its count by 1.
                map.put(num, map.get(num) + 1);
            }
        }

        // Print the resulting map, which contains unique elements and their counts.
        System.out.println(map);
    }

    /**
     * The main method to test the removeDuplicateUsingMap function with a sample input array.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Sample input array with duplicate elements.
        int[] arrayInput = {1, 1, 2, 3, 3, 5, 2, 1};

        // Call the removeDuplicateUsingMap function to process the input array.
        CountDuplicatesInArrayUsingMapV3ChatGPTFormated.removeDuplicateUsingMap(arrayInput);
    }
}
