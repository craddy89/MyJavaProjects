package AnnotationsJavaDocVarAgrs.handler;

import java.lang.reflect.Method;

public class Dispatcher {
    public static void main(String[] args) throws NoSuchMethodException {
        MathHandler mathHandler = new MathHandler();
        Class<?> cl = MathHandler.class;
        Method m = cl.getDeclaredMethod("addTwoNumbers", int.class, int.class);
        MathAnno mathAnno = m.getAnnotation(MathAnno.class);
        mathHandler.addTwoNumbers(mathAnno.num1(), mathAnno.num2());

    }
}
