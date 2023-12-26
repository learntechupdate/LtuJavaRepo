package com.thoidpractice.programs.countduplicateoccurance;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This class calculates and displays the count of duplicate occurrences in an array of integers.
 */
public class CountOfDuplicateOccuranceInArrayV1ChatGptFix {

    /**
     * The main entry point of the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] array = {5, 3, 3, 3, 2, 1, 5, 3, 16, 72, 5, 12, 16, 19, 15, 15};
        System.out.println("Original array: " + Arrays.toString(array));

        // Call the method to count and display duplicate occurrences.
        countOfDuplicateOccurrenceInArray(array);
    }

    /**
     * Counts and displays the duplicate occurrences in the given array.
     *
     * @param arrayInput The input array of integers.
     */
    public static void countOfDuplicateOccurrenceInArray(int[] arrayInput) {
        int[] temp = Arrays.copyOf(arrayInput, arrayInput.length);
        Arrays.sort(temp);

        ArrayList<Integer> duplicateArray = new ArrayList<>();

        // Find and store duplicate values in the duplicateArray list.
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                duplicateArray.add(temp[i]);
            }
        }

        System.out.print("Duplicate array list: ");
        for (int readValue : duplicateArray) {
            System.out.print(" " + readValue + " ");
        }

        Map<Integer, Integer> map = new HashMap<>();

        int count = 2;

        // Calculate the counts of duplicate occurrences and store them in the map.
        for (int i = 0; i < duplicateArray.size() - 1; i++) {
            if (duplicateArray.get(i).equals(duplicateArray.get(i + 1))) {
                count++;
            } else {
                map.put(duplicateArray.get(i), count);
                count = 2;
            }
        }

        // Handle the last element if it is a duplicate.
        if (!duplicateArray.isEmpty()) {
            map.put(duplicateArray.get(duplicateArray.size() - 1), count);
        }

        // Display the counts of duplicate occurrences.
        System.out.println("\nCounts:");
        for (int key : map.keySet()) {
            System.out.println(key + " has occurred: " + map.get(key) + " times");
        }
    }
}
