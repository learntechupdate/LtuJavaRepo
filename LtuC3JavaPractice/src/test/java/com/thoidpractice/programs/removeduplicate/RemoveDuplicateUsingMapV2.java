package com.thoidpractice.programs.removeduplicate;

import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicateUsingMapV2 {

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

        /*System.out.println(map);*/

        System.out.println("non dupliate ");
        for (int a: map.keySet()){
            System.out.print(a+" ");
        }
//        System.out.println(map);
    }


    public static void main(String[] args) {

        int[] array= {5,3,2,1,5,3,16,72,16,17};

        removeDuplicateUsingMap(array);
    }




}
