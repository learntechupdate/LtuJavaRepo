package com.thoid.javaconcepts.arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementArrayList {

    public static void main(String[] args) {

        removeElement(null);

    }


    public  static void removeElement(int a[]){

        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(5);

        list.removeIf(n->n.equals(5));

        System.out.println(list);


    }
}
