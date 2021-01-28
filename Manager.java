public class Manager extends Employee {
    boolean hasStocks;

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager() {
    }

    @Override
    public String toString() {
        return "Manager{" +
                "hasStocks=" + hasStocks +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void print() {
        super.print();
    }

    public void writeProcedures() {
        System.out.println("Менеджер: Надо ускориться!");
    }


    @Override
    public void goToDayOff() {
        System.out.println(getFio() + ": Завтра я беру отгул");
    }
}
