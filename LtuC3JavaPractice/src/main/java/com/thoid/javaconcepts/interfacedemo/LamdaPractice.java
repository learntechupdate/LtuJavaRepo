package com.thoid.javaconcepts.interfacedemo;

@FunctionalInterface
interface Lamda{
    public void show();
}
public class LamdaPractice {

    public static void main(String[] args){
        Lamda ref= ()->{
            System.out.println("Printing Lamda");
        };
        ref.show();
    }
}
