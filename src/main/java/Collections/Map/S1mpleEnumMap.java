package Collections.Map;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class S1mpleEnumMap {
    public static void main(String[] args) {
        Map<Animal2, String> enumMap = new EnumMap<>(Animal2.class);
        enumMap.put(Animal2.CAT, "C");
        enumMap.put(Animal2.DOG, "D");
        enumMap.put(Animal2.BIRD, "B");

        Collections.synchronizedMap(enumMap);

        Set set = enumMap.entrySet();
        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

enum Animal2 {
    CAT, DOG, BIRD
}