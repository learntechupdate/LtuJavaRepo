package com.thoidpractice.programs.countduplicateoccurance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class demonstrates how to count duplicate occurrences of integers in an ArrayList
 * and print the count for each duplicate.
 */
public class CountDuplicatesInArrayListChatGPTFormated {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);
        integerList.add(4);

        // Create a HashMap to store the count of each integer
        Map<Integer, Integer> integerCountMap = new HashMap<>();

        // Iterate through the ArrayList and update the count in the HashMap
        for (Integer num : integerList) {
            if (integerCountMap.containsKey(num)) {
                integerCountMap.put(num, integerCountMap.get(num) + 1);
            } else {
                integerCountMap.put(num, 1);
            }
        }

        // Print the count of duplicate occurrences
        for (Map.Entry<Integer, Integer> entry : integerCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }
    }
}
