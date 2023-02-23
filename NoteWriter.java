package s4;
import java.io.*;

public class NoteWriter<T> {
    public void write(Note<T> note) throws IOException {
//        FileWriter writer = new FileWriter("src/main/java/s4/note.txt");
//        writer.append(note.toString());
//        writer.close();
        FileWriter writer = new FileWriter("src/main/java/s4/note.txt", true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(note.toString()+"\n");
        bufferWriter.close();
    }
}
