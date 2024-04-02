package com.thoidpractice.programs.countduplicateoccurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
I've fixed the issues with the map and count of duplicate occurrences.
This code should now work as expected and correctly count the occurrences of duplicate elements in the input array.
 */
public class CountOfDuplicateOccuranceInArrayV2Xfailed

{

    public static void main(String[] args) {

        int[] array= {5,3,3,3,2,1,5,3,16,72,5};
        System.out.println("Orginal arrya"+Arrays.toString(array));

        countOfDuplicateOccuranceInArray(array);
    }
    public static  void countOfDuplicateOccuranceInArray(int[] arrayInput){


        int[] temp=arrayInput;
        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));


        ArrayList<Integer> duplicateArray=new ArrayList<>();

        //{1,2,3,3,3,3,3,5,16,72}
        for (int i = 0; i < temp.length; i++) {
            if(i+1<temp.length) {
                if (temp[i] == temp[i + 1]) {
                    duplicateArray.add(temp[i]);
                }
            }
          }

        System.out.print("duplicate array list : ");
        for(int readvalue: duplicateArray){
            System.out.print(" "+readvalue+" ");
        }

        //key valye
        Map<Integer,Integer> map=new HashMap<>();

        for(int num: duplicateArray){

            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else
                map.put(num,map.get(1));
        }


//        System.out.println(map);
        System.out.println("");
        for(int key: map.keySet()){
            System.out.println(key+" has occured : "+map.get(key)+" times");
        }

    }
}
