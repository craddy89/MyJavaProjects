package SerializationAndCloning.shallowCloning;

public class Student implements Cloneable{
    public String name;
    public int age;
    public Group1 group;

    public Student(String name, int age, Group1 group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public Student(String ivan, int i) {
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", group=" + group +
               '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
