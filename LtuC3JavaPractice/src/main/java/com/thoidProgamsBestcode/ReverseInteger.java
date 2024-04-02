package com.thoidProgamsBestcode;

/*
124 divided by 10 equals
12 with a remainder of 4

 */
public class ReverseInteger {
    public static void main(String[] args) {
        int number = 654; // Change this to the integer you want to reverse.
        int reversed = reverseInteger(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }

    public static int reverseInteger(int number) {
        int reversed = 0;
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the original number
            number = number / 10;
        }
        return reversed;
    }
}
