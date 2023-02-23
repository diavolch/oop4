package s4;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Note<T> {
    private int id;
    static int counter = 1;
    private T priority;
    private Date date;
    private String deadline;
    private String name;

    public Note(int id, T priority, Date date, String deadline, String name) {
        this.id = counter++;
        this.priority = priority;
        this.date = date;
        this.deadline = deadline;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", " + priority +
                ", date=" + date +
                ", deadline='" + deadline + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
