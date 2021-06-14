package IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class S1mpleCopyFIle {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\yaksu\\IdeaProjects\\SkillBox\\src\\main\\java\\sourceFile.txt");
        File targetFile = new File("C:\\Users\\yaksu\\IdeaProjects\\SkillBox\\src\\main\\java\\targetFile.txt");

        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
