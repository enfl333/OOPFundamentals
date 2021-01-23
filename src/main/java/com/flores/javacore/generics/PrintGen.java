package com.flores.javacore.generics;

public class PrintGen <T>{
    private T obj;

    public PrintGen(T aObj){
        this.obj = aObj;
    }

    public void printGen(){
        System.out.println("Generic obj: "+ obj.toString());
    }

}
