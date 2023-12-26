package com.thoidpractice.programs.searching;

public class LinerSearch {

    public static void main(String[] args) {

        int[] input = {6, 5, 75, 34, 61, 4, 65, 12};

        int searchVar = 13;
        boolean elementFound = false;

        for (int i = 0; i < input.length; i++) {

            if (input[i] == searchVar) {
                elementFound = true;
            }
        }

        if (elementFound){
            System.out.println("element found in array");
        }
        else{
            System.out.println("element Not in array");}
    }
}

