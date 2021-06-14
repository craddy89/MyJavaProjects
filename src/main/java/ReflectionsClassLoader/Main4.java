package ReflectionsClassLoader;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class Main4 {
    public static void main(String[] args) {
        try {
              Class<?> c = Class.forName(args[0]);
            System.out.println(c);
            printMembers(c.getFields());
            printMembers(c.getConstructors());
            printMembers(c.getMethods());

        } catch (ClassNotFoundException exception) {
            System.out.println("Unknown class: " + args[0]);
        }
    }

    private static void printMembers(Member[] members) {
        for (Member member : members) {
            if (member.getDeclaringClass() == Object.class) {
                continue;
            }
            String dec1 = member.toString();
            System.out.print("  ");
            System.out.println(dec1);
        }
    }
}
