package CollectionsFrameworkV2;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(20);
//        al.add(0,30);
//        al.add(40);
//
//        for (Integer integer : al) {
//            System.out.println(integer);
//        }

        for (int i = 0; i < 100; i++) {
            al.add(i);
            System.out.print(al.get(i) + " ");
        }
        System.out.println("\n" + al.size());

        al.subList(0, 50).clear();
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }

        System.out.println("\n" + al.size());

/*
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Simple");
            arrayList.add(25);

            ArrayList<Integer> arrayList1 = new ArrayList();
            arrayList1.add((Integer) arrayList.get(0));
            System.out.println(arrayList1.get(0));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
*/


    }
}
