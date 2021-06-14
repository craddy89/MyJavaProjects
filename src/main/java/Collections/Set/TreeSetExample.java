package Collections.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        ts.add(10);
        System.out.println(ts);

        System.out.println(ts.add(7));
        System.out.println(ts);
        System.out.println(ts.ceiling(2));
    }
}
