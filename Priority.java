package s4;

public class Priority<T>{
    T priority;
    public Priority(T priority) {
        this.priority = priority;
    }

    public Priority() {
    }
    @Override
    public String toString() {
        return "priority=" + priority;
    }
}
