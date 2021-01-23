package com.flores.javacore.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MainAnnotations {


    public static void main(String[] args) {
        init();
    }

    private static void init() {
        AnnotationsExample anno = new AnnotationsExample();
        Class classEx = anno.getClass();
        Method[] declaredMethods = classEx.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method declaredMethod = declaredMethods[i];
            if(declaredMethod.isAnnotationPresent(TestMethodParameter.class)){
                Annotation annotation = declaredMethod.getAnnotation(TestMethodParameter.class);
                TestMethodParameter testMethodParameter = (TestMethodParameter)annotation;
                int testId = testMethodParameter.testId();
                String reqId = testMethodParameter.reqId();
                Priority priority = testMethodParameter.prio();

                System.out.println("----TestMethodParameters---");
                System.out.println("Requirements reference: "+ reqId);
                System.out.println("Test id: "+ testId);
                System.out.println("Priority: "+ priority.toString());
            }
        }
        if(classEx.isAnnotationPresent(TestMethodParameter.class)){
            System.out.println("No TestMethodParameter in class? ");
        }else {
            System.out.println("No TestMethodParameter annotation present");
        }
    }
}
