package AnnotationsJavaDocVarAgrs.handler;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MathAnno {
    int num1() default 0;
    int num2() default 0;
}
