package com.thoid.javaconcepts.interfacedemo;

interface StaticInter{
    public static final int var=7;
   static void staticMethod(){
       System.out.println("Inksdfsf");
   }


}
public class StaticInterface {

  public static void main(String[] args){
      System.out.println(""+StaticInter.var);
      StaticInter.staticMethod();
  }
}
