package com.thoidpractice.programs.validateValuesIninputString;

import java.util.regex.Pattern;

public class ValidateInputStringRegularUsingExpressionsV2 {
    public static void main(String[] args) {
        String input = "The price is $50.99";

        // Use a regular expression to check for numeric values
        String pattern = ".*\\d+.*"; // This pattern checks for one or more digits
        boolean containsNumeric = Pattern.matches(pattern, input);


        if (containsNumeric) {
            System.out.println("The string contains a numeric value.");
        } else {
            System.out.println("The string does not contain a numeric value.");
        }
    }
}
