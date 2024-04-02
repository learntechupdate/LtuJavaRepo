package com.thoidpractice.programs.maxnumber;

public class MaxNumber {

    public static void main(String[] args) {

       int[] inputArray={-2,-13,-15,-1122,-134};

       int maxnuber= maxNumber(inputArray);

        System.out.println("max number is : "+maxnuber);
    }

    public  static  int maxNumber(int[] inputArray){

        int maxNumber=inputArray[0];

        for (int input :inputArray) {
            if(input>maxNumber){
                maxNumber=input;
            }
        }
        return maxNumber;
    }

}
