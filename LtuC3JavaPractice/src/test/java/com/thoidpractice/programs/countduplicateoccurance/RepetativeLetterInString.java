package com.thoidpractice.programs.countduplicateoccurance;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RepetativeLetterInString {

    public static void repetativeLetterInString(String s){

        Map<Character,Integer> map=new TreeMap<>();

        for (char c : s.toCharArray()){

            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else
                map.put(c,map.get(c)+1);
        }

        System.out.println(map);

        for ( Character key: map.keySet()){
            if(map.get(key)>=2) {
                System.out.println(key+" is repeated : "+map.get(key));
            }
        }

    }

    public static void main(String[] args) {

        repetativeLetterInString("Iam repeating and repating");
    }
}
