import java.util.Comparator;

public class WorkerBaseAgeComparator implements Comparator<WorkerBase> {
    @Override
    public int compare(WorkerBase w1, WorkerBase w2) {
        return Integer.compare(w1.getAge(), w2.getAge());
    }
}
