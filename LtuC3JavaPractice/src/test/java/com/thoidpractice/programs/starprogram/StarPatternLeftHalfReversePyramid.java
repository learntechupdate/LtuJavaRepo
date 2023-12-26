package com.thoidpractice.programs.starprogram;


    public class StarPatternLeftHalfReversePyramid {

        public static void starPatternLeftHalfPyramid(int rows){
            for (int i = 1; i <= rows; i++) {
                // Print spaces before the asterisks
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }

                // Print asterisks in reverse order
                for (int k = i; k <= rows; k++) {
                    System.out.print("*");
                }

                System.out.println(); // Move to the next line
            }
        }
        public static void main(String[] args) {
            int rows = 5; // You can change the number of rows as needed
            starPatternLeftHalfPyramid(5);

        }
    }

