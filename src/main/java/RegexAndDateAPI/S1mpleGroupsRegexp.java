package RegexAndDateAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S1mpleGroupsRegexp {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(.(.(.(.))))");
        Matcher m = p.matcher("Java");
        System.out.println(m.groupCount());
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.println(i + " = " + m.group(i));
            }
        }
    }
}
