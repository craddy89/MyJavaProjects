package RegVyraz;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String a = "Hello212314241there2313123211hey321321eggs";
        String[]words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello35325532there4343424hey";
        System.out.println(b.replaceAll("\\d+", "-"));

        String c = b.replaceFirst("\\d+", "-");
        System.out.println(c);
    }
}
