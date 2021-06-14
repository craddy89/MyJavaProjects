package StringStringBuilderStringBuffer;

import java.util.Locale;

public class S1mpleMethodsOfString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!";
        String str3 = "!!!";

        long l1 = System.nanoTime();
        String str = str1.concat(str2).concat(str3);
        long l2 = System.nanoTime();
        System.out.println(l2 - l1);

        long l3 = System.nanoTime();
        String str6 = str1 + str2 + str3;
        long l4 = System.nanoTime();
        System.out.println(l4 - l3);

        long l5 = System.nanoTime();
        String str7 = new StringBuilder().append(str1).append(str2).append(str3).toString();
        long l6 = System.nanoTime();
        System.out.println(l6 - l5);


//        System.out.println(str1.equals("Hello"));
//        System.out.println(str1.equalsIgnoreCase("HELLO"));
//        System.out.println(str1.startsWith("H"));
//        System.out.println(str1.substring(2));
//        System.out.println(str1.length());
//        System.out.println(str1.indexOf("o"));
//        System.out.println(str1.replace("l", "F"));
//        System.out.println(str1.toLowerCase(Locale.ROOT));
//        System.out.println(str1.toUpperCase(Locale.ROOT));

    }
}
