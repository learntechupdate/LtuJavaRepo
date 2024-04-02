package com.thoid.javaconcepts.interfacedemo;

 abstract class Human{

    public abstract void walk();

 public void running(){
     System.out.println("running");
 }

}
class Man extends Human {
    @Override
    public void walk() {
        System.out.println("walking");
    }
}

public class AbstrastDemo{

    public static void main(String[] args) {

        Human h=new Man();
       h.running();
       h.walk();

    }
}
