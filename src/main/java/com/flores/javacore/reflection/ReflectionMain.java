package com.flores.javacore.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {


    private static  void callMethod() throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {

        Method method = Class1.class.getDeclaredMethod("someMethod");
        method.setAccessible(true);
        method.invoke(null);

    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, NoSuchFieldException {

      callMethod();
      changeField();

    }

    private static void changeField() throws NoSuchFieldException, IllegalAccessException {
        String s = " Hello world";

        Field field = s.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(s,new char[]{}); //Change s to empty through reflection
        System.out.println("Start");
        System.out.println(s);
        System.out.println("End");

    }

}
