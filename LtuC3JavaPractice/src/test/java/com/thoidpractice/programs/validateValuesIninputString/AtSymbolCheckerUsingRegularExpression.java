package com.thoidpractice.programs.validateValuesIninputString;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AtSymbolCheckerUsingRegularExpression {
    public static void main(String[] args) {
        // Input string to check for "@" symbol
        String input = "example@email.com";

        // Define the regular expression pattern
        String regex = "@";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to match the pattern against the input
        Matcher matcher = pattern.matcher(input);

        // Check if the "@" symbol is found
        if (matcher.find()) {
            System.out.println("The input contains the @ symbol.");
        } else {
            System.out.println("The input does not contain the @ symbol.");
        }
    }
}

