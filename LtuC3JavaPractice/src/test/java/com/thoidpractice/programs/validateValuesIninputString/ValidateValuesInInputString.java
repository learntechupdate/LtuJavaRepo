package com.thoidpractice.programs.validateValuesIninputString;

/*
input should have @ and at least one number
 */
public class ValidateValuesInInputString {

    public static void main(String[] args) throws Exception {

        String input = "1233Hnsdf";

        boolean containsAtLeastOneDigit=false;
        boolean containsRequiredChar=false;

        for(char c : input.toCharArray()) {

            if (Character.isDigit(c)) {
                containsAtLeastOneDigit = true;
            }
            if(c=='@'){
                 containsRequiredChar = true;
            }
        }

            if((!containsAtLeastOneDigit)||(!containsRequiredChar)){
                throw new IllegalArgumentException("Please enter input having at least one digit and @ char");
            }
            else {
                System.out.println("Input is having @ and atleast one digit");
            }


    }


}
