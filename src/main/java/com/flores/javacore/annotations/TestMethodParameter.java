package com.flores.javacore.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestMethodParameter {
    String reqId();
    int testId() default 0;
    Priority prio() default Priority.MEDIUM;
}
