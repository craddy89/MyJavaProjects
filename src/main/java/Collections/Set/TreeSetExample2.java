package Collections.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        NavigableSet<Car> tc = new TreeSet<>();
        tc.add(new Car(5000));
        tc.add(new Car(3000));
        System.out.println(tc);

        NavigableSet<Integer> ts1 = ts.headSet(5, true);
        System.out.println(ts1);
        ts1.add(3);
        System.out.println(ts);
        System.out.println(ts1);
        ts.add(8);
        System.out.println(ts + "\n" + ts1);

        for (Integer temp : ts) {
            temp++;
            System.out.println(temp);
        }
        System.out.println(ts);
        for (Car temp : tc) {
            temp.price++;
        }
    }

    static class Car implements Comparable<Car> {
        private int price;

        public Car(int price) {
            this.price = price;
        }

        @Override
        public int compareTo(Car c) {
            return this.price - c.price;
        }
    }
}
