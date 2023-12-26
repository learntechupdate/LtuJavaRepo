package com.thoidpractice.programs.removeduplicate;

import java.util.Set;
import java.util.TreeSet;

/**
 * This class provides a method for removing duplicate elements from an integer array using a Set data structure.
 */
public class RemoveDuplicateUsingSetGPTFormated {

    /**
     * Removes duplicate elements from the given integer array and prints the unique elements in a sorted order.
     *
     * @param arrayInput The input integer array from which duplicates are to be removed.
     */
    public static void removeDuplicateUsingSet(int[] arrayInput) {
        // Create a TreeSet to store unique elements and automatically sort them.
        Set<Integer> setRemoveDup = new TreeSet<>();

        // Iterate through the input array to process elements.
        for (int uniqueValue : arrayInput) {
            // Add each element to the set to ensure uniqueness.
            setRemoveDup.add(uniqueValue);
        }

        // Print the sorted set, containing unique elements.
        System.out.println(setRemoveDup);
    }

    /**
     * The main method to test the removeDuplicateUsingSet function with a sample input array.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Sample input array with duplicate elements.
        int[] array = {5, 3, 2, 1, 5, 3, 16, 72};

        // Call the removeDuplicateUsingSet function to process the input array.
        removeDuplicateUsingSet(array);
    }
}
