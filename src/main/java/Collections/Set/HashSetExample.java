package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Арбуз");
        set.add("Банан");
        set.add("Дыня");
        set.add("Земляника");
        set.add("ирис");
        set.add("Картофель");
        for (String s : set) {
            System.out.println(s + " " + (short) s.hashCode());
        }
    }
}
