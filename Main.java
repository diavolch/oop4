package s4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Low note = new Low();
        NoteWriter nw = new NoteWriter();
        NoteReader nr = new NoteReader();
        Note<Low> n1 = new Note<>(1, note, new Date(), "25 февраля", "Di");
        Note<Low> n2 = new Note<>(1, note, new Date(), "1 марта", "Di");
        nw.write(n1);
        nw.write(n2);
        nr.read();

    }
}
