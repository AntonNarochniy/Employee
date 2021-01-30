public class ObjectClone extends Employee implements Cloneable{
    public ObjectClone() {
    }

    public ObjectClone(String fio, int age, int salary) {
        super(fio, age, salary);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void goToDayOff() {
    }




    @Override
    public String toString() {
        return "ObjectClone{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
