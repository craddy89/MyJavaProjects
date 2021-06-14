package SerializationAndCloning.shallowCloning;

public class ShallowClon {
    public static void main(String[] args) {
        Group1 group = new Group1(1);
        Student student = new Student("Ivan", 20, group);
        try {
            Student cloneStudent = (Student) student.clone();
            System.out.println(student);
            System.out.println(cloneStudent);

            cloneStudent.name = "Robert";
            cloneStudent.group.id = 10;

            System.out.println("After cloning");

            System.out.println(student);
            System.out.println(cloneStudent);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
