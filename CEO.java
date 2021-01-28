public class CEO extends Manager {
    private boolean hasCompanyCar;

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO() {
    }

    public CEO(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public String toString() {
        return "CEO{" +
                "hasCompanyCar=" + hasCompanyCar +
                ", hasStocks=" + hasStocks +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void print() {
        super.print();
    }

    public void goPublic() {
        System.out.println("Директор: Всем премия 300% от месячного оклада!");
    }

    @Override
    public void goToDayOff() {
        System.out.println(getFio() + ": Я беру отгул");
    }
}
