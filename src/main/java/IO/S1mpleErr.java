package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class S1mpleErr {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            InputStream inputStream = new FileInputStream(" ");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.err.println("File opening failed");
            e.printStackTrace();
        }

    }
}
