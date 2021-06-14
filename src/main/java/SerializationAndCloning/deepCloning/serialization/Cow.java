package SerializationAndCloning.deepCloning.serialization;

import java.io.Serializable;

public class Cow implements Serializable {
    private String name;
    private int weight;
    private int age;

    public Cow() { }

    @Override
    public String toString() {
        return "Cow{" +
               "name='" + name + '\'' +
               ", age=" + weight +
               ", head=" + age +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cow(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }


}
