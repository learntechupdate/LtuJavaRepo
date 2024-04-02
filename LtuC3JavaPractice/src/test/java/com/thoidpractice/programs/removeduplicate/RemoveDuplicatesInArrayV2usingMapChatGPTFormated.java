package com.thoidpractice.programs.removeduplicate;

import java.util.HashMap;
import java.util.Map;


/**
 * This class provides a method for removing duplicate elements from an integer array using a Map data structure.
 */

public class RemoveDuplicatesInArrayV2usingMapChatGPTFormated {

    /**
     * Removes duplicate elements from the given integer array and prints the counts of each element.
     *
     * @param arrayInput The input integer array from which duplicates are to be removed.
     * @return void
     */
    public static void  removeDuplicateUsingMap(int[] arrayInput) {

        // Create a TreeMap to store elements as keys and their counts as values.
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the input array to process elements.
        for (int num : arrayInput) {
            // Check if the element is already in the map.
            if (!map.containsKey(num)) {
                // If not, add it to the map with a count of 1.
                map.put(num, 1);
            }
            else {
                map.put(num,map.get(num)+1);
            }
        }

        for (int keyNum:map.keySet()){
            System.out.print(keyNum+" ");
        }
    }

    /**
     * The main method to test the removeDuplicateUsingMap function with a sample input array.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Sample input array with duplicate elements.
        int[] arrayInput = {18,1, 1, 2, 3, 3, 5, 2, 1,6,2,6,};

        // Call the removeDuplicateUsingMap function to process the input array.
        RemoveDuplicatesInArrayV2usingMapChatGPTFormated.removeDuplicateUsingMap(arrayInput);
    }
}
