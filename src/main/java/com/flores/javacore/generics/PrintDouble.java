package com.flores.javacore.generics;

public class PrintDouble {

    Double aDouble;


    public PrintDouble(Double aDouble){
        this.aDouble = aDouble;
    }


    public void printDouble(){
        System.out.println("Printing a Double: "+ aDouble.toString());
    }
}
