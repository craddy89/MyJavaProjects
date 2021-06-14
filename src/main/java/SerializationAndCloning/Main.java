package SerializationAndCloning;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Java");
        Student student = new Student(1, "Ivan");

        student.setGroup(group);
        group.setStudent(student);

        File f = new File("C:\\Users\\yaksu\\IdeaProjects\\SkillBox\\src\\main\\java\\SerializationAndCloning\\output.txt");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))){
            outputStream.writeObject(student);
            student = null;
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
