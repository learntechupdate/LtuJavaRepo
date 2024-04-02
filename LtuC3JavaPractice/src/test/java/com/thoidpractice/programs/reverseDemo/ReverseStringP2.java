package com.thoidpractice.programs.reverseDemo;

public class ReverseStringP2 {

    private static String reverseString2(String str) {

        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {

            rev+=str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {

        System.out.println(reverseString2("I iwant to get revesred"));
    }



}
