package com.thoidProgamsBestcode;


public class ValidateInputStringhavingAtcharOneNumber {


    public static void main(String[] args) throws Exception {

        // Sample input string
        String input = "1233Hnsdf";

        // Flags to track whether the input contains at least one digit and '@'
        boolean containsAtLeastOneDigit = false;
        boolean containsRequiredChar = false;

        // Loop through each character in the input string
        for (char c : input.toCharArray()) {

            // Check if the character is a digit
            if (Character.isDigit(c)) {
                containsAtLeastOneDigit = true;
            }

            // Check if the character is '@'
            if (c == '@') {
                containsRequiredChar = true;
            }
        }

        // Check if the input meets the criteria and provide feedback
        if (!containsAtLeastOneDigit || !containsRequiredChar) {
            throw new Exception("Please enter input having at least one digit and @ char");
        } else {
            System.out.println("Input is having @ and at least one digit");
        }
    }
}

