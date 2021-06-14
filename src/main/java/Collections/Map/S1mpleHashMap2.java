package Collections.Map;

import java.util.HashMap;

public class S1mpleHashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null,25);

        System.out.println(hm.get(null));
    }
}
