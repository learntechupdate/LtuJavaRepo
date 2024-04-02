package com.thoidpractice.programs.reverseDemo;



/*
First American company:

Reverse the string with preserving the position of spaces : i/p= My name is Touheed o/p = de ehou T  si emanMy

 */
public class ReverseInputPreserveSpacesP2 {



    private static void reverseInputPreserveSpaces2(String inputString) {

        char[] resultArray = inputString.toCharArray();

        //store the index of space
        for (int i = 0; i <inputString.length() ; i++) {
            if(inputString.charAt(i)==' '){
                resultArray[i]=' ';
            }
        }

        int j=inputString.length()-1;
        for (int i = 0; i <inputString.length(); i++) {

            if (inputString.charAt(i) != ' ') {
                if (resultArray[j] == ' ') {
                    j--;
                }
                resultArray[j] = inputString.charAt(i);
                j--;
            }
        }

        System.out.println(resultArray);
        String finalReslut = String.valueOf(resultArray);
        System.out.println(finalReslut);

    }

    public static void main(String[] args) {

        System.out.println("My name is Touheed");
        reverseInputPreserveSpaces2("My name is Touheed");

    }



}
