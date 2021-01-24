public class Developer extends Employee {
    private String grades;

    public String getGrades() {
        return grades;
    }
    public void setGrades(String grades) {
        this.grades = grades;
    }

    public Developer() {
    }

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "grades='" + grades + '\'' +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void print() {
        super.print();
    }
    public void writeCode(){
        System.out.println("Разработчик: Это не баг, это фича!");
    }

    @Override
    public void goToVacation() {
        System.out.println("В отпуск буду заниматься ремонтом");
    }
}
