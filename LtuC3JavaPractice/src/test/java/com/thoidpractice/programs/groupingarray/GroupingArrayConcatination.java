package com.thoidpractice.programs.groupingarray;

import java.util.ArrayList;

public class GroupingArrayConcatination {

    public static void main(String[] args) {
        int[] array={2,1,-3,-6,-2,0,-53,52,67,73,-73};
        groupingArray(array);
    }

    public  static void groupingArray(int[] array){

        ArrayList<Integer> list=new ArrayList<>();

        ArrayList<Integer> listNegative=new ArrayList<>();
        for (int postive:array ) {
            if(postive>=0)
            list.add(postive);
        }


        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        System.out.println(list);

        for (int negative:
             array) {

            if(negative<0){
                listNegative.add(negative);
            }
        }

        System.out.println(listNegative);

        listNegative.addAll(list);

        System.out.println(listNegative);



    }
}
