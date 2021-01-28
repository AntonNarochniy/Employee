public class Specialist extends Employee {
    int levels;

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }


    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public Specialist() {
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", levels=" + levels +
                '}';
    }

    public void workWithClients() {
        System.out.println("Специалист: чем могу быть полезен?");
    }

    // ДЗ 23.1 переопределил класс goToDayOff()

    @Override
    public void goToDayOff() {
        System.out.println(getFio() + ": Мне бы отгул...");
    }
}
