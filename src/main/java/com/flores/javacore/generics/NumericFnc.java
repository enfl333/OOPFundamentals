package com.flores.javacore.generics;

public class NumericFnc<T extends Number> {
    T obj;

    public NumericFnc(T aObj){
        this.obj = aObj;
    }

    double square(){
        return obj.intValue()* obj.doubleValue();
    }


    /***
     * To avoid type compare on T
     *
     * @param ob
     * @return
     */
    boolean absEqual(NumericFnc<?> ob){
        if(Math.abs(obj.doubleValue())== Math.abs(ob.obj.doubleValue())){
            return true;
        }
        return false;
    }

}
