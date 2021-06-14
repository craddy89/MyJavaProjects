package Collections.ComparatorComparable;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(2);
        a1.add(5);
        a1.add(8);

        System.out.println(a1);

        for (Integer tmp : a1) {
            System.out.println(tmp);
        }

        for (Integer tmp : a1) {
            System.out.println(tmp);
        }

    }
}
