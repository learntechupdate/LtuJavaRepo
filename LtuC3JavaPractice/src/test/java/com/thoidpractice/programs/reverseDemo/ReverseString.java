package com.thoidpractice.programs.reverseDemo;

public class ReverseString {

    public static String reverseString(String s){

        String rev="";
        for (int i = s.length()-1; i >=0; i--) {
                  rev+=s.charAt(i)  ;
        }

        return rev;

    }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverseString("I have in string"));
    }
}
