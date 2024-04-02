package com.thoidpractice.programs.removeduplicate;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateUsingSet
{

    public static void main(String[] args) {

        int[] array= {5,3,2,1,5,3,16,72};

        removeDuplicateUsingSet(array);
    }

    public static  void removeDuplicateUsingSet(int[] arrayInput){
        Set<Integer> setRemoveDup=new TreeSet<>();


        for(int uniqueValue : arrayInput){
            setRemoveDup.add(uniqueValue);
        }
        System.out.println(setRemoveDup);
    }
}
