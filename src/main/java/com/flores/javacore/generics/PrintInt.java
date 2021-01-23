package com.flores.javacore.generics;

public class PrintInt {

    Integer integer;


    public PrintInt(Integer aInteger){
        this.integer = aInteger;
    }


    public void printInt(){
        System.out.println("Printing an Integer: "+integer.toString());
    }


}
