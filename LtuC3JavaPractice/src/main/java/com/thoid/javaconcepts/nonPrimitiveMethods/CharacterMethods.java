package com.thoid.javaconcepts.nonPrimitiveMethods;

public class CharacterMethods {
    public static void main(String[] args) {

       // isLetter - Test if it's a letter:
        char ch1 = 'A';
        boolean isLetter = Character.isLetter(ch1);
        System.out.println(isLetter); // Output: true

       // isDigit - Test if it's a digit:

        char ch2 = '7';
        boolean isDigit = Character.isDigit(ch2);
        System.out.println(isDigit); // Output: true

        //isWhitespace - Test if it's a whitespace:

        char ch3 = ' ';
        boolean isWhitespace = Character.isWhitespace(ch3);
        System.out.println(isWhitespace); // Output: true

       // getNumericValue - Get numeric value of a digit:

        char ch4 = '9';
        int numericValue = Character.getNumericValue(ch4);
        System.out.println(numericValue); // Output: 9

       // isLowerCase - Test if it's a lowercase letter:

        char ch5 = 'z';
        boolean isLowerCase = Character.isLowerCase(ch5);
        System.out.println(isLowerCase); // Output: true

       // isJavaIdentifierStart - Test if it's a valid Java identifier start:

        char ch6 = '_';
        boolean isIdentifierStart = Character.isJavaIdentifierStart(ch6);
        System.out.println(isIdentifierStart); // Output: true

        //isJavaIdentifierPart - Test if it's a valid Java identifier part:

        char ch7 = '$';
        boolean isIdentifierPart = Character.isJavaIdentifierPart(ch7);
        System.out.println(isIdentifierPart); // Output: true

        //toString - Convert to a string:

        char ch8 = 'X';
        String chStr = Character.toString(ch8);
        System.out.println(chStr); // Output: "X"

        //compareTwo - Compare characters:

        char chx = 'A';
        char chy = 'b';
        int comparison = Character.compare(chx, chy);
        System.out.println(comparison); // Output: -1  if both same than print 0, case difference -33

       // hashCode - Get the hash code:

        char ch9 = 'C';
        int hash = Character.hashCode(ch9);
        System.out.println(hash); // Output: 67

       // forDigit - Convert digit to character:

        int digit = 5;
        char digitChar = Character.forDigit(digit, 10);
        System.out.println(digitChar); // Output: '5'

       // digit - Get numeric value of a character with a specified radix:
        char ch10 = 'A';
        int numericValue2 = Character.digit(ch10, 16);
        System.out.println(numericValue2); // Output: 10


    }
}
