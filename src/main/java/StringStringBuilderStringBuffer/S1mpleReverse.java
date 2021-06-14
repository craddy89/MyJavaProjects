package StringStringBuilderStringBuffer;

public class S1mpleReverse {
    public static void main(String[] args) {
//        String s1 = "Hi, how u doing?";
//        StringBuilder sb = new StringBuilder(s1);
//        sb.reverse();
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer();
//        System.out.println("Длина -> " + sb.length());
//        System.out.println("Size: " + sb.capacity());
//
//        sb.append("Java");
//        System.out.println("String: " + sb);
//        System.out.println("Length: " + sb.length());
//        System.out.println("Size: " + sb.capacity());
//        System.out.println("Reverse: " + sb.reverse());

        String str1 = "Cat has ";
        String str2 = " paws";
        int paws = 4;
        StringBuffer sb = new StringBuffer(20);
        sb.append(str1).append(paws).append(str2);
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
