package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class S1mpleHashMap {
    public static void main(String[] args) {
        String[] people = new String[]{"Евгений", "Александр", "Карина", "Вероника", "Тамара", "Сергей"};

        HashMap<String, Human> map = addHumansToMap(people);

        for (Map.Entry<String, Human> pair :
                map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, Human> addHumansToMap(String[] people) {
        HashMap<String, Human> allHumans = new HashMap<>();

        for (String s :
                people) {
            allHumans.put(s, new Human(s));
        }
        return allHumans;
    }
}

class Human {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
               "name='" + name + '\'' +
               '}';
    }
}