package AnnotationsJavaDocVarAgrs;

public class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
