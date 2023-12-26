package com.thoidpractice.programs.countduplicateoccurance;

import java.util.Map;
import java.util.TreeMap;

public class CountOfDuplicateOccuranceUsingMapV3 {

    public static void removeDuplicateUsingMap(int[] arrayInput){

        Map<Integer,Integer> map=new TreeMap<>();

        for (int  num : arrayInput){
            if(!map.containsKey(num)){
               map.put(num,1) ;
            }
            else {
                map.put(num,map.get(num)+1);
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {

        int[] arrayInput= {1,1,2,3,3,5,2,1};

        CountDuplicatesInArrayUsingMapV3ChatGPTFormated.removeDuplicateUsingMap(arrayInput);
    }

}
