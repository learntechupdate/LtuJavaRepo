package com.thoidpractice.programs.countduplicateoccurance;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
i/p= Firefox o/p=F2i1r1e1o1x1 : using For loop : using Hashmap

 */
public class HashMapCountOccuranceCharInArray {

       public static void countOfCharOccuranceInArray(String s){

        Map<Character,Integer> map=new TreeMap<>();
        for (char c: s.toLowerCase().toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else {
                map.put(c, map.get(c)+1);
            }
        }

        System.out.println(map);
    }
    public static void main(String[] args) {

          countOfCharOccuranceInArray("Firefox");
    }
}
