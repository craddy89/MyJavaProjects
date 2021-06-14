package Collections.Queue;

import java.util.ArrayDeque;

public class Example2 {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Украина");
        states.add("Франция");

        states.push("Великобритания");

        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            System.out.println(states.pop());
        }
        System.out.println("Размер очереди: " + states.size());
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for (Person person : people) {
            System.out.println(person.getName());
        }

    }
    static class Person {
        private final String name;

        public Person(String value) {
            this.name = value;
        }

        public String getName() {
            return name;
        }
    }
}
