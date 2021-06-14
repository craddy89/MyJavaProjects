package SerializationAndCloning.deepCloning.reflectionCopy;

public class Cow {
    private String name;
    private int age;
    private int head;

    public Cow() { }

    @Override
    public String toString() {
        return "Cow{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", head=" + head +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public Cow(String name, int age, int head) {
        this.name = name;
        this.age = age;
        this.head = head;
    }


}
