package AnnotationsJavaDocVarAgrs.handler;

public class MathHandler {
    @MathAnno(num1 = 10, num2 = 20)
    public void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
