package JSON.jsonEx1.parser;

import JSON.jsonEx1.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = null;

        try {
            person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(person);

        assert person != null;
        System.out.println(person.getFirstname());
    }
}
