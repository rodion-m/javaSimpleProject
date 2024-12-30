import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtility {
    // append to file
    public static void appendToFile(String fileName, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();
    }
}
