package IO;

import java.io.File;
import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.file.Files;

public class S1mpleMoveFile {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\yaksu\\IdeaProjects\\SkillBox\\src\\main\\java\\sourceFile.txt");
        File targetFile = new File("C:\\Users\\yaksu\\IdeaProjects\\SkillBox\\src\\main\\java\\IO\\targetFile.txt");

        try {
            Files.move(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
