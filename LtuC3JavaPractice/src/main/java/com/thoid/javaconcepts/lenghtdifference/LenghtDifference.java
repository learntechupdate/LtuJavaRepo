package com.thoid.javaconcepts.lenghtdifference;

import java.util.*;

public class LenghtDifference {

    public static void main(String[] args) {

                // Creating a character array with a length of 2
                char[] charArray = new char[2];
                System.out.println("Length of charArray: " + charArray.length);

                // Creating a string array with two elements
                String[] stringArray = {"Touheed", "Maaz"};
                System.out.println("Length of stringArray: " + stringArray.length);

                // Creating an integer array with a length of 5
                int[] intArray = new int[5];
                System.out.println("Length of intArray: " + intArray.length);

                // Creating a string
                String name = "I am here to find length";
                System.out.println("Length of name: " + name.length());

                // Creating a collection (ArrayList) and checking its size
                Collection collection = new ArrayList();
                System.out.println("Size of collection: " + collection.size());

                // Creating a collection (HashSet) and checking its size
                Collection collection1 = new HashSet();
                System.out.println("Size of collection1: " + collection1.size());

                // Creating a list (ArrayList) of integers and checking its size
                List<Integer> list = new ArrayList<>();
                System.out.println("Size of list: " + list.size());

                // Creating a set (HashSet) of integers and checking its size
                Set<Integer> list2 = new HashSet<>();
                System.out.println("Size of list2: " + list2.size());
            }
        }


