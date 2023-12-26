package com.thoid.javaconcepts.interfacedemo;


interface Writer{
    void write();
}

class Pen implements Writer{

    public void write(){
        System.out.println("writing using Pen");
    }
}

class Pencil implements Writer{

    public void write(){
        System.out.println("writing using Pencil");
    }
}

class Kit{
    public void startWriting(Writer classRef){
        classRef.write();
    }

}
public class IntefaceDemo {

   public static void main(String[] args){

       Kit kit=new Kit();
       kit.startWriting(new Pen());
       kit.startWriting(new Pencil());

   }

}
