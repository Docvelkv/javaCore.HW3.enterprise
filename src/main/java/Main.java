public class Main {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();
        personnel.addToPersonnel(new Worker("Иван", 28, Position.third));
        personnel.addToPersonnel(new Freelancer("Максим", 34, Position.second));
        personnel.addToPersonnel(new Worker("Андрей", 27, Position.third));
        personnel.addToPersonnel(new Worker("Семён", 39, Position.first));
        personnel.addToPersonnel(new Worker("Иван", 33, Position.second));
        personnel.addToPersonnel(new Freelancer("Иван", 40, Position.first));
        personnel.addToPersonnel(new Worker("Андрей", 29, Position.third));
        personnel.addToPersonnel(new Freelancer("Сергей", 35, Position.second));

        for (WorkerBase workerBase : personnel) {
            System.out.println(workerBase.getName() + " " + workerBase.getSalary());
        }

        personnel.sortPersonnel();
        System.out.println("\nпосле сортировки\n");
        personnel.forEach(x -> System.out.println(x.getName() + " " + x.getSalary()));
    }
}
