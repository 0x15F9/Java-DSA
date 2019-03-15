import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * WriteFile
 */
public class WriteFile {
    public static void main(String[] args) {
        String newLine = "Non et vero.";
        try {
            write("newfile.txt", newLine);
            append("existingfile.txt", newLine);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static void write(String filepath, String content) throws IOException {
			FileWriter fileWriter = new FileWriter(filepath);
			fileWriter.write(content);
			fileWriter.close();
    }

    public static void append(String filepath, String content) throws IOException {
			FileWriter fileWriter = new FileWriter(filepath, true);
			fileWriter.write(content);
			fileWriter.close();
    }
}