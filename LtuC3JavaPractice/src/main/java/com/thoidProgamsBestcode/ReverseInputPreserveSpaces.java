package com.thoidProgamsBestcode;



/*
First American company:

Reverse the string with preserving the position of spaces : i/p= My name is Touheed o/p = de ehou T  si emanMy

 */
public class ReverseInputPreserveSpaces {

    private static void getReverseInputPreserveSpaces(String inputString) {

        char[] charArray = inputString.toCharArray();

        //store the index of space
        for (int i = 0; i <inputString.length() ; i++) {
            if(inputString.charAt(i)==' '){
                charArray[i]=' ';
            }
        }

        int j=inputString.length()-1;
        for (int i = 0; i <inputString.length(); i++) {

            if (inputString.charAt(i) != ' ') {
                if (charArray[j] == ' ') {
                    j--;
                }
                charArray[j] = inputString.charAt(i);
                j--;
            }
        }


        String finalResult = String.valueOf(charArray);
        System.out.println(finalResult);

    }

    public static void main(String[] args) {

        System.out.println("My name is Touheed");
        getReverseInputPreserveSpaces("My name is Touheed");

    }

}
