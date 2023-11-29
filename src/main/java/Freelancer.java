public class Freelancer extends WorkerBase{

    //region Конструктор
    public Freelancer(String name, int age, Position position) {
        super(name, age, position);
        this.salary = calcSalary(position);
    }
    //endregion

    //region Переопределение метода calcSalary
    @Override
    public double calcSalary(Position position) {
        if(position == Position.third) return 20.8 * 8 * 300;
        if(position == Position.second) return 20.8 * 8 * 390;
        return 20.8 * 8 * 480;
    }
    //endregion
}
