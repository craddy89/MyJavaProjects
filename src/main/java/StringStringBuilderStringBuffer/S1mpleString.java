package StringStringBuilderStringBuffer;

public class S1mpleString {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");

        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(arr,0,4);

        System.out.println(str3);

    }
}
