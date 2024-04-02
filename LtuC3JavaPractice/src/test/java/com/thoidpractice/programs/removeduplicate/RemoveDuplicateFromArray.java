package com.thoidpractice.programs.removeduplicate;

import java.util.*;

public class RemoveDuplicateFromArray {


    public static int[] removeDuplictesInArray(int[] inputArray){

        Set<Integer> removeduplicate=new TreeSet<>();

        for(int input : inputArray){
            removeduplicate.add(input);
        }

        int[] output=new int[removeduplicate.size()];

        int index=0;
        for (int i :removeduplicate ){

            output[index]=i;
            index++;
        }

        return  output;
    }

    public static void main(String[] args) {



        int[] input={3,5,5,7,4,1,4,8,6,6,6,6,3,5,6,7,232,6454};


        int[] output = removeDuplictesInArray(input);

        for(int o: output){
            System.out.println(" "+o+" ");
        }


        Scanner keyboradInput=new Scanner(System.in);


        System.out.println("Size of array");
        int size=keyboradInput.nextInt();

        int[] keyboardinputArray = new int[size];

        for (int i = 0; i <size ; i++) {
            System.out.println("Enter the array value");
            keyboardinputArray[i]=keyboradInput.nextInt();
        }

        int[] nonDuplicateArrray = removeDuplictesInArray(keyboardinputArray);

        for(int o: nonDuplicateArrray){
            System.out.print(" "+o+" ");
        }

        keyboradInput.close();

    }

}
