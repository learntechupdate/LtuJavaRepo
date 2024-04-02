package com.thoidpractice.interview.publicsapients;

/*
input value should have @ and atleast one number
 */

@FunctionalInterface
interface Filter{
    boolean filterdata(String input);
}

public class MainFilter implements Filter {

    @Override
    public boolean filterdata(String input) {
        ;
        return false;
    }


    public static void main(String[] args) {




    }




}
