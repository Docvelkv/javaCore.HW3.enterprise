public class Worker extends WorkerBase{

    //region Конструктор
    public Worker(String name, int age, Position position) {
        super(name, age, position);
        this.salary = calcSalary(position);
    }
    //endregion

    //region Переопределение метода calcSalary
    @Override
    public double calcSalary(Position position) {
        if(position == Position.third)return 50000;
        if(position == Position.second)return 65000;
        return 80000;
    }
    //endregion
}
