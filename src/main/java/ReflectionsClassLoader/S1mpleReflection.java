package ReflectionsClassLoader;

import java.util.Map;

public class S1mpleReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. GetClass
//        S1mpleReflection s1mpleReflection = new S1mpleReflection();
//        Class<?> cl = s1mpleReflection.getClass();
//
//        int[] arr = new int[10];
//        Class<?> cl2 = arr.getClass();
//
//        Class<?> cl3 = "World".getClass();
//
//        Class<?> cl4 = Integer.valueOf(5).getClass();
//        System.out.println(cl);
//        System.out.println(cl2);
//        System.out.println(cl3);
//        System.out.println(cl4);

        // 2. String.class
//        Class<?> cl = S1mpleReflection.class;
//        Class<?> cl2 = int[].class;

        // 3.Class.forName();
//        Class<?> cl = Class.forName("java.lang.String");
//        System.out.println(cl);
//
//        Class<?> cl2 = Class.forName("[D");
//        System.out.println(cl2);

        // 4.
        Class<?> cl = Integer.class.getSuperclass();
        System.out.println(cl);
        Class<?> cl2 = Map.Entry.class.getEnclosingClass();
        System.out.println(cl2);

    }
}
