package Collections.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample {
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Yevheniy", 333),
                new SimpleComparableStudent("Andrew", 222),
                new SimpleComparableStudent("Igor", 111),
                new SimpleComparableStudent("Peter", 300),
        };
        Arrays.sort(myStudents, new SimpleComparatorStudent());

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }

    }
}

class SimpleComparableStudent {
    private final String firstName;
    private final int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " +
                group;
    }

    public String getFirstName() {
        return firstName;
    }
}

class SimpleComparatorStudent implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String firstName1 = ((SimpleComparableStudent)o1).getFirstName();
        String firstName2 = ((SimpleComparableStudent)o2).getFirstName();
        return firstName1.compareTo(firstName2);
    }

}
