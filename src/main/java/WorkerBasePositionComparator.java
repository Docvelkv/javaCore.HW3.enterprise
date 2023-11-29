import java.util.Comparator;

public class WorkerBasePositionComparator implements Comparator<WorkerBase> {
    @Override
    public int compare(WorkerBase w1, WorkerBase w2) {
        return Integer.compare(w1.getPosition(), w2.getPosition());
    }
}
