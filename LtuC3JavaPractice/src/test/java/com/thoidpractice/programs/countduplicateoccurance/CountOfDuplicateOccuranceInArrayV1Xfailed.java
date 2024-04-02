package com.thoidpractice.programs.countduplicateoccurance;

import java.util.*;

public class CountOfDuplicateOccuranceInArrayV1Xfailed

    /*
Incorrect Indexing for Counting Duplicates: In your code, you are not correctly counting the occurrences of duplicate elements. The index nextIndex should be updated with i and the count should be incremented for each occurrence.

Off-by-one Error: In your code, you're adding 1 to the count (j) while putting it in the map. This is not necessary, as j already starts at 1.
     */
{

    public static void main(String[] args) {

        int[] array= {5,3,3,3,2,1,5,3,16,72,5};
        System.out.println("Orginal arrya"+Arrays.toString(array));

        countOfDuplicateOccuranceInArray(array);
    }
    public static  void countOfDuplicateOccuranceInArray(int[] arrayInput){


        int[] temp=arrayInput;
        Arrays.sort(temp);


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


        Map<Integer,Integer> map=new HashMap<>();

        int j=1,nextIndex=0;

        for (int i = 0; i < duplicateArray.size(); i++) {
            if(i+1<duplicateArray.size()) {
                if (duplicateArray.get(i) == duplicateArray.get(i + 1)) {
                    j++;
                    map.put(duplicateArray.get(i), j+1);
                    nextIndex=i;
                }
            }
        }

        System.out.println(map);
        System.out.println("");
        for(int key: map.keySet()){
            System.out.println(key+" has occured : "+map.get(key)+" times");
        }
    }
}
