package s4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NoteReader {
    public void read() throws IOException {
        FileReader reader = new FileReader("src/main/java/s4/note.txt");
        Scanner scan = new Scanner(reader);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        reader.close();
    }
}
