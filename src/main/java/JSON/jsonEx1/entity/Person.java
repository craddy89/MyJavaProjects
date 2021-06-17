package JSON.jsonEx1.entity;

import java.util.List;

public class Person {
    private String firstname;
    private String lastname;
    private Course course;
    private List<String> personalContacts;

    public Person() {
    }

    public Person(String firstname, String lastname, Course course, List<String> personalContacts) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.course = course;
        this.personalContacts = personalContacts;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Course getCourse() {
        return course;
    }

    public List<String> getPersonalContacts() {
        return personalContacts;
    }

    @Override
    public String toString() {
        return "Person{" +
               "firstname='" + firstname + '\'' +
               ", lastname='" + lastname + '\'' +
               ", course=" + course +
               ", personalContacts=" + personalContacts +
               '}';
    }
}
