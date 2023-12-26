package com.thoid.javaconcepts.interfacedemo;


interface PrintShow{
    public void show();
}
public class AnyonumsWithInterface {

    public static void main(String[] args) {

        PrintShow printShow = new PrintShow() {

            public void show() {
                System.out.println("printing show");
            }
        };

        printShow.show();
    }


}
