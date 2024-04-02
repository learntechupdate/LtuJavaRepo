package com.thoidpractice.programs.reverseDemo;


import java.util.ArrayList;
import java.util.Arrays;

/*
First American company:

Reverse the string with preserving the position of spaces : i/p= My name is Touheed o/p = de ehou T  si emanMy

 */
public class ReverseInputPreserveSpaces {


    public  static  void reverseInputPreserveSpaces(String s) {

        char[] temp=new char[s.length()];

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' ' ){
                temp[i]=' ';
            }
        }

         int j=s.length()-1;

        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)!=' ') {

                if(temp[j]==' '){
                    j--;
                }
                temp[j]=s.charAt(i);
                j--;
            }

        }

        System.out.println(temp);
    }





    public static void main(String[] args) {

        System.out.println("My name is Touheed");
        reverseInputPreserveSpaces("My name is Touheed");

    }

}
