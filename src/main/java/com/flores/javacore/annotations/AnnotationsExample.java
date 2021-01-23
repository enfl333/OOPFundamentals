package com.flores.javacore.annotations;

public class AnnotationsExample {

    @TestMethodParameter(reqId = "http://www.dn.se",testId = 1, prio = Priority.HIGH)
    public void testSomeRequirements1(){
        System.out.println("Testing functional test case1");
    }

    @TestMethodParameter(reqId = "http://www.aftonbladet.se",testId = 2)
    public void testSomeRequirements2(){
        System.out.println("Testing functional test case1");
    }

}
