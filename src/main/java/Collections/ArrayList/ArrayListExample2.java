package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Animal> a1 = new ArrayList<>();

        a1.add(new Animal("Sphynx", 5000));
        a1.add(new Animal("Malamute", 4000));

        for (Animal tmp : a1) {
            tmp.price += 1000;
        }
        System.out.println(a1);
    }
}

class Animal {

    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "breed='" + breed + '\'' +
               ", price=" + price +
               '}';
    }
}
