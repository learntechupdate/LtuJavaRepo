package com.thoidpractice.interview.schneiderelectrical;

public class TestDeomo {

    public static void overLoadDemo(String s){
        System.out.println("String outo");
    }

    public static void overLoadDemo(Object o){
        System.out.println("Object outo");
    }

    public static void main(String[] args) {
//        Object o=new Object();
        overLoadDemo(null);
    }
}
