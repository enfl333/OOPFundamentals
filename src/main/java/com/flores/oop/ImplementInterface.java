package com.flores.oop;

public class ImplementInterface implements MyInterface{

    @Override
    public void myImplementationOfTruth() {
        System.out.println("Implement interface");
    }

    @Override
    public void myNewImplementationOfTruth() {
        System.out.println("New Implementation method");
    }
}
