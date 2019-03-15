import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ReadFile
 */
public class ReadFile {

    public static void main(String[] args) {
        String pathname = "file.txt";
        
        try {
            readfile(pathname);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public static void readfile(String pathname) throws FileNotFoundException{
        Scanner fileScanner = new Scanner(new File( pathname));

        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }

        fileScanner.close();
    }
}