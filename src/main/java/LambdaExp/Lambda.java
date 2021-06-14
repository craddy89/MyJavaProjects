package LambdaExp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");

        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
    }
}
