package ReflectionsClassLoader;

import java.lang.reflect.Modifier;

public class Main2 {

    private static final class CatModifier{

    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        Class cl = CatModifier.class;

        System.out.println(s + "ClassName: " + s1 + cl.getName());
        System.out.print(s + "Modifiers of class: " + s1);

        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }

    }
}
