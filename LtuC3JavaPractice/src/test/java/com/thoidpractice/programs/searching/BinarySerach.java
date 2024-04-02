package com.thoidpractice.programs.searching;

import java.util.Arrays;

/*
it will in sorted array
 */
public class BinarySerach {



    public static void main(String[] args) {
        int [] array={2,5,6,12,86,14,25,16};
        System.out.println(binarySearch(array,14));

    }

    public static int binarySearch(int[] array,int a){
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array,a));

        System.out.println(Arrays.toString(array));

        //1st find the middle
        int intial=0;
        int finalvalue=array.length;
        int mid=(intial+finalvalue)/2;

//        System.out.println(mid);

        while (intial<finalvalue){
            if(array[mid]==a){
                System.out.println(array[mid]+" value found at index "+mid);
                return mid;
            }
            if(array[mid]>a){
                finalvalue=mid--;
            }
            if(array[mid]<a){
                intial=mid++;
            }
        }

        return -1;

    }
}

