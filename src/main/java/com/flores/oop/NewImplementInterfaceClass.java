package com.flores.oop;

public class NewImplementInterfaceClass implements MyInterface{
    @Override
    public void myImplementationOfTruth() {
        System.out.println("New Class implementing Interface");
    }

    @Override
    public void myNewImplementationOfTruth() {
        System.out.println("Fixing after merge");
    }
}
