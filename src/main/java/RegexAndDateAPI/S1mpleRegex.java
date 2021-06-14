package RegexAndDateAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S1mpleRegex {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[a-z&&[^zq]]+");
//        Matcher matcher = pattern.matcher("abcd");

        Pattern pattern = Pattern.compile("[а-яієї']+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Мар'яна");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
