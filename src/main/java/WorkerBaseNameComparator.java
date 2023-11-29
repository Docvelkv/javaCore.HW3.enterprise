import java.util.Comparator;

public class WorkerBaseNameComparator implements Comparator<WorkerBase> {
    @Override
    public int compare(WorkerBase w1, WorkerBase w2) {
        return w1.getName().compareTo(w2.getName());
    }
}
