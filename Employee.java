public abstract class Employee<getClass> {
    String fio;
    int age;
    int salary;

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

    public abstract void goToDayOff();


}
