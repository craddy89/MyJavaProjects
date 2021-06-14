package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person(3, "Bob"));
    people.add(new Person(2, "Katy"));
    people.add(new Person(1, "Mike"));
    people.sort(Comparator.comparing(Person::getName));
        System.out.println(people);

    }
    static class Person {
       final private int id;
       final private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   '}';
        }
    }
}
