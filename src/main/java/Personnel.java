import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Personnel implements Iterable<WorkerBase>{
    //region Поля
    private final List<WorkerBase> list;

    //endregion

    //region Конструктор
    public Personnel() {
        this.list = new ArrayList<>();
    }
    //endregion

    //region Методы

    /**
     * Добавление WorkerBase в список
     * @param wb объект WorkerBase
     */
    public void addToPersonnel(WorkerBase wb){
        this.list.add(wb);
    }

    /**
     * Сортировка: сначала по уровню,
     * затем по имени и по возрасту
     */
    public void sortPersonnel(){
        Comparator<WorkerBase> pComp = new WorkerBasePositionComparator()
                .thenComparing(new WorkerBaseNameComparator()
                        .thenComparing(new WorkerBaseAgeComparator()));
        this.list.sort(pComp);
    }
    //endregion

    //region Реализация интерфейса Iterable
    @Override
    public Iterator<WorkerBase> iterator() {
        return list.iterator();
    }
    //endregion
}
