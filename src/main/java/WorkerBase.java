public abstract class WorkerBase {

    //region Поля
    protected String name;
    protected int age;
    protected Position position;
    protected double salary;

    //endregion

    //region Базовый конструктор
    protected WorkerBase(String name, int age, Position position){
        this.setName(name);
        this.setAge(age);
        this.setPosition(position);
    }
    //endregion

    //region Getters&Setters
    /**
     * Получение имени
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Установка имени
     * @param name Имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Визуализация возраста
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * Установка возраста
     * @param age возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Визуализация категории
     * @return int
     */
    public int getPosition() {
        if(this.position == Position.third) return 3;
        if(this.position == Position.second) return 2;
        return 1;
    }

    /**
     * Установка категории
     * @param position категория
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Визуализация уровня зарплаты
     * @return double
     */
    public double getSalary() {
        return salary;
    }
    //endregion

    //region Методы
    /**
     * Абстрактный метод рассчёта зарплаты
     * @param position категория
     * @return double
     */
    public abstract double calcSalary(Position position);

    //endregion

    //region Переопределение toString
    @Override
    public String toString(){
        return "Имя: " + this.getName() + "\t" +
                "Возраст: " + this.getAge() + "\t" +
                "Категория: " + this.getPosition() + "\t" +
                "Зарплата: " + this.getSalary();
    }
    //endregion
}
