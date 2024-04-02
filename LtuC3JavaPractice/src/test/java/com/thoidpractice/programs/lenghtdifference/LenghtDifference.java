package com.thoidpractice.programs.lenghtdifference;

import java.util.*;

public class LenghtDifference {

    public static void main(String[] args) {

        char[] charArray = new char[2];
        System.out.println(charArray.length);

        String[] stringArray={"Touheed","Maaz"};
        System.out.println(stringArray.length);

        int[] intArray=new int[5];
        System.out.println(intArray.length);

        String name="I here to find lenght";
        System.out.println(name.length());


        Collection collection=new ArrayList();
        System.out.println(collection.size());


        Collection collection1=new HashSet();
        System.out.println(collection1.size());


        List<Integer>  list=new ArrayList<>();
        System.out.println(list.size());

        Set<Integer>  list2=new HashSet<>();
        System.out.println(list2.size());

    }
}
