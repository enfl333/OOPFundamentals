package com.flores.javacore.generics;


/***
 * Generics basic 1-1
 * Continue with 2,3 on
 * https://www.youtube.com/watch?v=h7piyWnQbZA
 *
 * Keep on coding
 *
 */
public class MainGen {

    public MainGen(){
        init();
    }

    private void init() {
        PrintInt intToPrint = new PrintInt(new Integer(3));
        intToPrint.printInt();

        PrintDouble doubleToPrint = new PrintDouble(new Double(2.0));
        doubleToPrint.printDouble();

        PrintGen<Integer> intGen = new PrintGen<>(new Integer(4));
        intGen.printGen();

        PrintGen<Double> doubleGen = new PrintGen<>(new Double(5.0));
        doubleGen.printGen();

        NumericFnc<Integer> fn1 = new NumericFnc(new Integer(8));
        NumericFnc<Double> fn2 = new NumericFnc(new Double(9.0));

        System.out.println("NumericFunc 1:"+fn1.square());
        System.out.println("NumericFunc 2:"+fn2.square());

        NumericFnc<Integer> iOb = new NumericFnc<Integer>(6);
        NumericFnc<Double> iOb2 = new NumericFnc<Double>(-6.0);
        System.out.println("Are they abs value equal?: "+iOb.absEqual(iOb2));


    }

    public static void main(String[] args) {
        new MainGen();
    }


}
