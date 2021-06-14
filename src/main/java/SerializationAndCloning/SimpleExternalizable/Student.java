package SerializationAndCloning.SimpleExternalizable;

import java.io.*;

public class Student implements Externalizable {
    private int id;
    private transient String userName;


    public Student() {

    }

    public Student(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", userName='" + userName + '\'' +
               '}';
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(userName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        userName = (String) in.readObject();
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan");
        File f = new File("C:\\Users\\yaksu\\IdeaProjects\\SkillBox\\src\\main\\java\\SerializationAndCloning\\SimpleExternalizable\\externaliz.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))){
            outputStream.writeObject(student);
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
