package com.thoid.javaconcepts.nonPrimitiveMethods;

public class IntegerMethods {
    public static void main(String[] args) {
        String numStr = "42";
        int number = Integer.parseInt(numStr);
        System.out.println(number); // Output: 42

        int num = 123;
        String numStr1 = Integer.toString(num);
        System.out.println(numStr1); // Output: "123"

        int num1 = 10;
        int num2 = 20;
        int comparison = Integer.compare(num1, num2);
        System.out.println(comparison); // Output: -1 (num1 < num2)


    }
}
