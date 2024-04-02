package com.thoidpractice.programs.collectionspractice;

//Collection don't have index values only add value and fetch
//compile time error will get if we specific generics
import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {

    public static void main(String[] args) {

        Collection num=new ArrayList();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add("h222");//

        for(Object o:num){
            System.out.println(""+o);
        }


        for(Object o:num){
            int n=(Integer)o;
            System.out.println(""+n*2);//run time error for "h222"
            /* class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
            at com.thoid.javapractice.collectionspractice.CollectionsDemo.main*/
        }



        Collection<Integer> num2=new ArrayList<Integer>();
        num2.add(1);
        num2.add(2);
        num2.add(3);
//        num2.add("h222");//compile time error will get
    }
}
