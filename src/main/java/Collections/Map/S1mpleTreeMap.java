package Collections.Map;

import java.util.*;

public class S1mpleTreeMap {
    public static void main(String[] args) {
        NavigableMap<String, Animal3> nm = new TreeMap<>();

        nm.put("Yevheniy", new Animal3(7000));

        Animal3 pet = new Animal3(8000);
        nm.put("Alex", pet);
        nm.put("Edward", new Animal3(5000));
        nm.put("Edward", new Animal3(6000));

        System.out.println(nm);

        System.out.println(nm.get("Alex"));

        System.out.println(nm.containsKey("Edward"));
        System.out.println(nm.containsValue(new Animal3(8000)));
        System.out.println(nm.containsValue(pet));

        Set<String> nameKeys = nm.keySet();

        Collection<Animal3> petsPrice = nm.values();
        System.out.println(nameKeys);
        System.out.println(petsPrice);

        Set<Map.Entry<String, Animal3>> keysAndValues = nm.entrySet();
        System.out.println(keysAndValues);
        for (Map.Entry<String, Animal3> temp:
            keysAndValues ) {
            temp.setValue(new Animal3(10000));
        }
        System.out.println(keysAndValues);
    }
}

class Animal3 {
    private final int price;

    public Animal3(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal3 animal3 = (Animal3) o;
        return price == animal3.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Animal3{" +
               "price=" + price +
               '}';
    }
}