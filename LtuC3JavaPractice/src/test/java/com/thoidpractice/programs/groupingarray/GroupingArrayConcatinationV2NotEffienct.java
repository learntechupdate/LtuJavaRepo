package com.thoidpractice.programs.groupingarray;

import java.util.Arrays;

public class GroupingArrayConcatinationV2NotEffienct {

    public static void main(String[] args) {
        int[] array={2,1,-3,-6,-2,0,-53,52,67,73,-73};
        groupingArray(array);
    }

    public  static void groupingArray(int[] array){

        String res = Arrays.toString(array);

        String emp="",pos="";

        System.out.println(res);

        for (int i = 0; i <array.length ; i++) {
            if(array[i]<0){
                emp=emp+array[i]+",";
            }
            if(array[i]>=0) {
                pos=pos+array[i]+",";
            }
        }
        System.out.println(emp+""+pos);
        String test = (emp + "" + pos);

       /* ArrayList<String> arroutput=new ArrayList<>();
        for (char ch: test.toCharArray()) {
           arroutput.add(String.valueOf(ch));
        }

        System.out.println(arroutput);
*/

    }
}
