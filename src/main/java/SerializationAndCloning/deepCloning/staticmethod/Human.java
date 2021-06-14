package SerializationAndCloning.deepCloning.staticmethod;

public class Human {
    private int age;
    private String name;

    public Human() { }

    public static Human getHumanInstanceWithAgeAndString (int age, String name) {
        Human instance = new Human();
        instance.age = age;
        instance.name = name;
        return instance;
    }

    @Override
    public String toString() {
        return "Human{" +
               "age=" + age +
               ", name='" + name + '\'' +
               '}';
    }
}
