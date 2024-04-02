package com.thoidpractice.programs.starprogram;

/*
   *
  **
 ***
****
 */
public class StarPatternLeftHalfPyramid {

    public static void starPatternLeftHalfPyramid(int n){

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();


    }

}

    public static void main(String[] args) {
        starPatternLeftHalfPyramid(5);
    }
}
