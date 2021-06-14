package RegVyraz;

public class Main1 {
    public static void main(String[] args) {

        String a = "-0233";
        String b = "0233";
        String c = "+0233";
        System.out.println(a.matches("([-+])?\\d*"));
        System.out.println(b.matches("([-+])?\\d*"));
        System.out.println(c.matches("([-+])?\\d*"));

        String d = "+-szdwqdZwa1213123234";
        System.out.println(d.matches("[-+|a-zZ]*\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ua)"));

        String url2 = "http://www.yandex.ru";
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String url3 = "Hello there!";
        System.out.println(url3.matches("http://www\\..+\\.(com|ua)"));

        String f = "12";
        System.out.println(f.matches("\\d{2,}"));
    }
}
