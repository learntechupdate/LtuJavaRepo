package com.thoid.javaconcepts.interfacedemo;

interface DefaultMethod{
    public void show();

    default void printing(){
        System.out.println("Prining");
    }
}

class DefaulImp implements  DefaultMethod{

    public void show(){
        System.out.println("show");
    }
}
public class DefaultMethodInterface {

    public static void main(String[] args) {

        DefaulImp def=new DefaulImp();
        def.show();
        def.printing();
    }
}
