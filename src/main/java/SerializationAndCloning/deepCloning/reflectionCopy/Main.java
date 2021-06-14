package SerializationAndCloning.deepCloning.reflectionCopy;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cow originalCow = new Cow("Milka", 5, 1);
        System.out.println("Original cow: " + originalCow);

        Cow copiedCow = reflectionCloning(originalCow);
        System.out.println(copiedCow);

    }

    private static Cow reflectionCloning(Cow originalCow) {
        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");

            name.setAccessible(true);
            head.setAccessible(true);

            name.set(originalCow, "Buryonka");
            head.set(originalCow,2);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return originalCow;
    }
}