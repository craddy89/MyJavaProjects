package AnnotationsJavaDocVarAgrs;

public class VarARGS {
    private int calcSum(int i, int... ints) {
//        int result = 0;
//        for (int anInt : ints) {
//            result += anInt;
//        }
        return 10;
    }

    private int calcSum(double i , int... ints) {
//        int result = 0;
//        for (int anInt : ints) {
//            result += anInt;
//        }
        return 5;
    }



    public static void main(String... a) {
        VarARGS v = new VarARGS();
        System.out.println(v.calcSum(1,2,3));
        System.out.println(v.calcSum(1,2));
//        System.out.println(v.calcSum());
    }
}
