package kg.megacom.employee.parent;

// ДЗ 23.1  - сделал класс Emploee абстрактным
public abstract class Employee<getClass> {
    public String fio;
    public int age;
    public int salary;

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // ДЗ 23.1 добавил абстрактный класс goToDayOff()

    public abstract void goToDayOff();


}
