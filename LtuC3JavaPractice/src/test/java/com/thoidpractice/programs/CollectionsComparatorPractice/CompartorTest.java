package com.thoidpractice.programs.CollectionsComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorTest {


    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(9298);
        values.add(5367);
        values.add(5879);
        values.add(3572);

        Comparator comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                return i%10>j%10?1:-1;
            }
        };


        Collections.sort(values,comparator);

        System.out.println(values.toArray());

       for(int i: values){
           System.out.println(i);
       }

    }

}


