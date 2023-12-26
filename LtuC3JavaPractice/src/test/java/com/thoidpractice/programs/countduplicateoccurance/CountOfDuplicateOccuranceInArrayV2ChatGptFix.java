package com.thoidpractice.programs.countduplicateoccurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This class calculates the count of duplicate occurrences in an integer array
 */
public class CountOfDuplicateOccuranceInArrayV2ChatGptFix {

    /**
     * The main method demonstrates the usage of the countOfDuplicateOccurrenceInArray method.
     * It creates an array, calls the method, and prints the original array and duplicate counts.
     *
     * @param args The command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int[] array = {5, 3, 3, 3, 2, 1, 5, 3, 16, 72, 5, 4, 16, 19};
        System.out.println("Original array: " + Arrays.toString(array));

        countOfDuplicateOccurrenceInArray(array);
    }

    /**
     * Calculates and prints the count of duplicate occurrences in the input array.
     *
     * @param arrayInput The input integer array for which duplicate occurrences are counted.
     */
    public static void countOfDuplicateOccurrenceInArray(int[] arrayInput) {
        int[] temp = Arrays.copyOf(arrayInput, arrayInput.length);
        Arrays.sort(temp);

        ArrayList<Integer> duplicateArray = new ArrayList<>();

        // Find and add duplicate values to the duplicateArray
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                duplicateArray.add(temp[i]);
            }
        }

        System.out.print("Duplicate array list: ");
        for (int readValue : duplicateArray) {
            System.out.print(" " + readValue + " ");
        }

        // Key-value map to store counts of duplicate values
        Map<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each duplicate value
        for (int num : duplicateArray) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 2); // Initialize count to 2 for new duplicate values (as one is already in the list)
            }
        }

        System.out.println("\nCounts:");
        for (int key : map.keySet()) {
            System.out.println(key + " has occurred: " + map.get(key) + " times");
        }
    }
}
