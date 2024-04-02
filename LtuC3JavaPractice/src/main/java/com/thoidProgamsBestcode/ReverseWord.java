package com.thoidProgamsBestcode;

/*
i/p = I like java programing o/p = programming java like I

 */
public class ReverseWord {

    //Reverses the order of words in the input string.
    public static String getReversedWord(String str){

        // Split the input string into an array of words using space as a delimiter.
        String[] temp=str.split(" ");

        String rev="";

        // Iterate through the array of words in reverse order and construct the reversed string.
        for (int i = temp.length-1; i >=0 ; i--) {

            rev=rev+temp[i]+" ";
        }

        return rev;
    }

    public static void main(String[] args) {

        System.out.println(getReversedWord("I like java programing"));
    }
}
