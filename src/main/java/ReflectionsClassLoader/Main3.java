package ReflectionsClassLoader;

import java.lang.reflect.Field;

public class Main3 {

    public static final class Dog{
        private final int age = 3;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        try {
            Class<?> cl = Dog.class;
            Dog dog = new Dog();
            Field field = cl.getDeclaredField("age");
            field.setAccessible(true);
            System.out.println("Private field value: " + field.getInt(dog));
            field.setInt(dog,10);
            System.out.println("New Private field value: " + field.getInt(dog));
        }catch (Exception exception){
            exception.toString();
        }
    }
}
