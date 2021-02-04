package kg.megacom.employee.childs;

import kg.megacom.employee.Grades;
import kg.megacom.employee.parent.Employee;

public class Developer extends Employee {
    private Grades grades;

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public Developer() {
    }

    public Developer(String fio, int age, int salary, Grades grades) {
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

    public void writeCode() {
        System.out.println("Разработчик: Это не баг, это фича!");
    }

    // ДЗ 23.1 переопределил класс goToDayOff()

    @Override
    public void goToDayOff() {
        System.out.println(getFio() + ": Мне нужен отгул");
    }
}
