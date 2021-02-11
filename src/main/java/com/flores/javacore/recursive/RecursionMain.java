package com.flores.javacore.recursive;

public class RecursionMain {

    public static void main(String[] args) {
        countBackwards(15);
    }

    public static void countBackwards(int n){

        if(n ==0){//Base case
            System.out.println("Done!");
        }else{
            System.out.println(n);
            n--; //Discount
            countBackwards(n);
        }
    }

}
