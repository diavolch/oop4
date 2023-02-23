package s4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Low note1 = new Low();
        Middle note2 = new Middle();
        High note3 = new High();
        NoteWriter nw = new NoteWriter();
        NoteReader nr = new NoteReader();
        Note<Low> n1 = new Note<>(Note.counter, note1, new Date(), "25 февраля", "Di");
        Note<Middle> n2 = new Note<>(Note.counter, note2, new Date(), "1 марта", "Valya");
        Note<High> n3 = new Note<>(Note.counter, note3, new Date(), "4 октября", "Diana");

        nw.write(n1);
        nw.write(n2);
        nw.write(n3);
        nr.read();

    }
}
