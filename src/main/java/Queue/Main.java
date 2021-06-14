package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    static private final int MAX_VALUE = 3;
    public static void main(String[] args) {
    Person person1 = new Person(1);
    Person person2 = new Person(2);
    Person person3 = new Person(3);
    Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<>(MAX_VALUE);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));
    }

   public static class Person {
        private final int id;

        public Person(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Person{" +
                   "id=" + id +
                   '}';
        }
    }
}
