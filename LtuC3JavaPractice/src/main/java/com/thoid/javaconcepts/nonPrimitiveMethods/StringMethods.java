package com.thoid.javaconcepts.nonPrimitiveMethods;

public class StringMethods {

        public static void main(String[] args) {
            // 1. Creating a String
            String str1 = "Hello, World!";
            System.out.println(str1);//Hello, World!

            // 2. Concatenation
            String str2 = "Hello, ";
            String str3 = "World!";
            String concatStr = str2.concat(str3);
            System.out.println(concatStr);//Hello, World!

            // 3. Length of the String
            int length = str1.length();
            System.out.println("Length: " + length);//Length: 13

            // 4. Character at a specific index
            char charAtIndex = str1.charAt(7);
            System.out.println("Character at index 7: " + charAtIndex);//Character at index 7: W

            // 5. Substring
            String substring = str1.substring(0, 5);
            System.out.println("Substring: " + substring);//Substring: Hello

            // 6. Index of a character
            int indexOfChar = str1.indexOf("o");
            System.out.println("Index of 'o': " + indexOfChar);//Index of 'o': 4

            // 7. Index of a character with starting position
            int indexOfCharFromIndex = str1.indexOf("o", 5);
            System.out.println("Index of 'o' from index 5: " + indexOfCharFromIndex);//Index of 'o' from index 5: 8

            // 8. Check if starts with a prefix
            boolean startsWith = str1.startsWith("Hello");
            System.out.println("Starts with 'Hello': " + startsWith);//Starts with 'Hello': true

            // 9. Check if ends with a suffix
            boolean endsWith = str1.endsWith("World!");
            System.out.println("Ends with 'World!': " + endsWith);//Ends with 'World!': true

            // 10. Convert to lowercase
            String lowercaseStr = str1.toLowerCase();
            System.out.println("Lowercase: " + lowercaseStr);//Lowercase: hello, world!

            // 11. Convert to uppercase
            String uppercaseStr = str1.toUpperCase();
            System.out.println("Uppercase: " + uppercaseStr);//Uppercase: HELLO, WORLD!

            // 12. Replace characters
            String replacedStr = str1.replace("o", "x");
            System.out.println("Replaced: " + replacedStr);//Replaced: Hellx, Wxrld!

            // 13. Remove leading and trailing whitespace
            String withWhitespace = "  Trim me  ";
            String trimmedStr = withWhitespace.trim();
            System.out.println("Trimmed: " + trimmedStr);//Trimmed: Trim me

            // 14. Compare to another string
            String compareStr = "Hello, World";
            int compareResult = str1.compareTo(compareStr);
            System.out.println("Compare result: " + compareResult);//Compare result: 0

            // 15. Check if empty
            boolean isEmpty = str1.isEmpty();
            System.out.println("Is empty: " + isEmpty);//Is empty: false


                    // 16. Check if contains a sequence
                    boolean contains = str1.contains("lo");
                    System.out.println("Contains 'lo': " + contains);  // Output: Contains 'lo': true

                    // 17. Split a string into an array
                    String splitStr = "Java,Python,C++,JavaScript";
                    String[] languages = splitStr.split(",");
                    System.out.println("Split into an array:");
                    for (String language : languages) {
                        System.out.println(language);
                    }
        /* Output:
        Split into an array:
        Java
        Python
        C++
        JavaScript
        */

                    // 18. Check equality with another string
                    boolean equals = str1.equals("Hello, World!");
                    System.out.println("Equals 'Hello, World!': " + equals);  // Output: Equals 'Hello, World!': true

                    // 19. Ignore case while checking equality
                    boolean equalsIgnoreCase = str1.equalsIgnoreCase("hello, world!");
                    System.out.println("Equals (ignore case) 'hello, world!': " + equalsIgnoreCase);  // Output: Equals (ignore case) 'hello, world!': true

                    // 20. Format with placeholders
                    String formattedStr = String.format("Formatted: %s, %d", "Text", 123);
                    System.out.println(formattedStr);  // Output: Formatted: Text, 123

                    // 21. Check if it matches a regular expression
                    boolean matches = str1.matches("Hello.*");
                    System.out.println("Matches regex 'Hello.*': " + matches);  // Output: Matches regex 'Hello.*': true

                    // 22. Replace with regular expression
                    String replacedRegex = str1.replaceAll("o", "x");
                    System.out.println("Replaced (regex): " + replacedRegex);  // Output: Replaced (regex): Hellx, WXrld!

                    // 23. Get bytes in different character encodings
                    byte[] utf8Bytes = str1.getBytes();
                    System.out.println("Bytes (UTF-8): " + new String(utf8Bytes));  // Output: Bytes (UTF-8): Hello, World!

                    // 24. Check if a string starts with a character
                    boolean startsWithChar = str1.startsWith("H");
                    System.out.println("Starts with 'H': " + startsWithChar);  // Output: Starts with 'H': true

                    // 25. Check if a string ends with a character
                    boolean endsWithChar = str1.endsWith("!");
                    System.out.println("Ends with '!': " + endsWithChar);  // Output: Ends with '!': true

                    // 26. Return a character array
                    char[] charArray = str1.toCharArray();
                    System.out.println("Character array:");
                    for (char c : charArray) {
                        System.out.println(c);
                    }
        /* Output:
        Character array:
        H
        e
        l
        l
        o
        ,
        W
        o
        r
        l
        d
        !
        */

                    // 27. Check if it contains a specific substring
                    boolean containsSubstring = str1.contains("World");
                    System.out.println("Contains 'World': " + containsSubstring);  // Output: Contains 'World': true

                    // 28. Check if it matches another string ignoring case
                    boolean equalsIgnoreCaseStr = str1.equalsIgnoreCase("HELLO, WORLD!");
                    System.out.println("Equals (ignore case) 'HELLO, WORLD!': " + equalsIgnoreCaseStr);  // Output: Equals (ignore case) 'HELLO, WORLD!': true

                    // 29. Get a specific code point
                    int codePoint = str1.codePointAt(7);
                    System.out.println("Code point at index 7: " + codePoint);  // Output: Code point at index 7: 44

                    // 30. Check if it matches another string ignoring case
                    boolean equalsIgnoreCaseStr1 = str1.equalsIgnoreCase("HELLO, WORLD!");
                    System.out.println("Equals (ignore case) 'HELLO, WORLD!': " + equalsIgnoreCaseStr1);  // Output: Equals (ignore case) 'HELLO, WORLD!': true
                }
            }





