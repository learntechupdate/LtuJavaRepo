package com.thoidpractice.programs.collectionConverstions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
input string array with comma name and number Ex. Raj,9766622272
o/p on entering the name Raj o/p should be it's respectice number
 */
public class Conversions {

    public static void main(String[] args) {

        ArrayList<String>  input=new ArrayList<>();
        input.add("Raj,9738100282");
        input.add("Maaz,66687878");
        input.add("thoid,78787878");

        String[] nameNumberSplit;

       /*
       String[] nameNumberSplit = input.get(0).split(",");
       Map<String,String> test=new HashMap<>();
        test.put(nameNumber[0],nameNumber[1]);

//        System.out.println(test);

        System.out.println(test.get("Raj"));*/

        Map<String,String> nameNumberParing=new HashMap<>();


        /*int index=0;
        for(String split:input){
            nameNumberSplit=input.get(index).split(",");
            index++;
            nameNumberParing.put(nameNumberSplit[0],nameNumberSplit[1]);
        }*/

        for (int i = 0; i < input.size(); i++) {
            nameNumberSplit=input.get(i).split(",");
            nameNumberParing.put(nameNumberSplit[0],nameNumberSplit[1]);
        }

        System.out.println(nameNumberParing);

        System.out.println(nameNumberParing.get("Maaz"));

        for (String key:nameNumberParing.keySet()){
            System.out.println(nameNumberParing.get(key));
        }


    }
}

