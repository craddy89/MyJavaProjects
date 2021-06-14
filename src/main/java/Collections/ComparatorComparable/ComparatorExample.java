package Collections.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Animal2 cat = new Animal2("Oriental", 7, 25, 5000);
        Animal2 dog = new Animal2("Labrador", 30, 20, 4000);
        Animal2 bird = new Animal2("King Penguin", 15, 8, 50000);

        Animal2[] c = {cat, dog, bird};

        Arrays.sort(c, new ComparatorByPrice());

        for (Animal2 tmp :
                c) {
            System.out.println(tmp);
        }
        System.out.println();

        Arrays.sort(c, new ComparatorBySpeed());
        for (Animal2 tmp:
             c) {
            System.out.println(tmp);
        }
        System.out.println();

        Arrays.sort(c, new ComparatorByColor());
        for (Animal2 tmp :
                c) {
            System.out.println(tmp);
        }
        System.out.println();
    }
}

class Animal2 {
    String breed;
    int weight;
    int speed;
    int price;

    public Animal2(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal2{" +
               "breed='" + breed + '\'' +
               ", weight=" + weight +
               ", speed=" + speed +
               ", price=" + price +
               '}';

    }
}

class ComparatorByPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal2) o1).price - ((Animal2) o2).price;
    }
}

class ComparatorBySpeed implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal2) o1).speed - ((Animal2) o2).speed;
    }
}

class ComparatorByColor implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal2) o1).breed.compareTo(((Animal2) o2).breed);
    }
}