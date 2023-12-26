package com.thoidpractice.programs.largest3NumersInArray;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaxThreeNumbersWithoutSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(30);
        numbers.add(25);
        numbers.add(40);
        numbers.add(15);

        List<Integer> maxThree = findMaxThree(numbers);

        System.out.println("The maximum three numbers are: " + maxThree);
    }

    public static List<Integer> findMaxThree(List<Integer> numbers) {
        if (numbers.size() < 3) {
            throw new IllegalArgumentException("List should contain at least 3 elements");
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(3); // Priority queue to keep track of the top 3 maximum numbers

        // Initialize maxHeap with the first 3 numbers
        for (int i = 0; i < 3; i++) {
            maxHeap.offer(numbers.get(i));
        }

        // Iterate through the rest of the numbers
        for (int i = 3; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int smallestMax = maxHeap.peek();

            if (currentNum > smallestMax) {
                maxHeap.poll(); // Remove the smallest max value
                maxHeap.offer(currentNum); // Add the new currentNum
            }
        }

        List<Integer> maxThree = new ArrayList<>(maxHeap);
        return maxThree;
    }
}

