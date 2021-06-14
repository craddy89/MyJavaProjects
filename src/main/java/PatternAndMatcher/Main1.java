package PatternAndMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        String text = """
                Hello, Guys! I send you my email joe@gmail.com so we can
                keep in touch. Thanks, Joe! That's cool. I am sending you
                my address: tim@yandex.ua. Let's stay in touch...
                """;
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ua)");
        Matcher matcher = email.matcher(text);

        while (matcher.find())
            System.out.println(matcher.group());


    }
}
