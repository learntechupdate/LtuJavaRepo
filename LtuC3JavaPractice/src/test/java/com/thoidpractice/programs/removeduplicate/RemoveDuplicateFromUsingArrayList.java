package com.thoidpractice.programs.removeduplicate;

import java.util.ArrayList;

/*
Not working

 */
public class RemoveDuplicateFromUsingArrayList {

    public static ArrayList<Integer> removeDuplicateFromUsingArrayList(int[] inputArray){

        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int values: inputArray ){
            arrayList.add(values);
        }


        for (int i = 0; i <arrayList.size()-1 ; i++) {
            for (int j = 0; j <arrayList.size()-1 ; j++) {
                if(i==j){


                    }
                    else if(arrayList.get(i) == arrayList.get(j)) {
                        arrayList.add(j, 0);
                    }
                }
            }


//        System.out.println();
//        arrayList.forEach(System.out::println);

        for (int io:arrayList ){
            System.out.println(io);
        }

        return arrayList;
    }

    public static void main(String[] args) {

        int[] input={3,5,5,7};

        removeDuplicateFromUsingArrayList(input);
    }
}
