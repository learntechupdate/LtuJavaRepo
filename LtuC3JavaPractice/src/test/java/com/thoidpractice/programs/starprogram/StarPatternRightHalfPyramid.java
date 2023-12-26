package com.thoidpractice.programs.starprogram;

/*
*
* *
* * *
* * * *
* * * * *
 */
public class StarPatternRightHalfPyramid {

      public static void starPatternRightHalfPyramid(int n){

          for (int i = 0; i < n; i++) {

              for (int j = 0; j <=i ; j++) {
                  System.out.print("* ");
              }
              System.out.println("");
          }
      }

    public static void main(String[] args) {

          starPatternRightHalfPyramid(5);

    }

}
