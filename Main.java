public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];


        Specialist specIvanov = new Specialist("Иванов", 19, 1000, 1);
        employees[1] = specIvanov;
        Specialist specPetrov = new Specialist("Петров", 20, 2000, 2);
        employees[2] = specPetrov;
        Specialist specSidorov = new Specialist("Сидоров", 25, 3000, 3);
        employees[3] = specSidorov;

        specIvanov.print();
        specPetrov.print();
        specSidorov.print();
        specIvanov.workWithClients();
        Developer devAibek = new Developer("Курманалиев Айбек", 22, 10000, "junior");
        employees[4] = devAibek;
        Developer devAida = new Developer("Таласбаева Аида", 25, 20000, "middle");
        employees[5] = devAida;
        Developer devAndrey = new Developer("Коробов Андрей", 30, 30000, "senior");
        employees[6] = devAndrey;
        Developer devMichael = new Developer("Michael Katzman", 40, 80000, "senior");
        employees[7] = devMichael;
        devAibek.print();
        devAida.print();
        devAndrey.print();
        devMichael.print();
        devMichael.writeCode();
        Manager managerBarno = new Manager("Сагатова Барно", 31, 20000, false);
        employees[8] = managerBarno;
        Manager managerAnara = new Manager("Токталиева Анара", 30, 20000, false);
        employees[9] = managerAnara;

        managerAnara.print();
        managerBarno.print();
        managerAnara.writeProcedures();
        CEO ceoBoss = new CEO("Директоров Директрбек", 50, 2000000, true, true);
        employees[0] = ceoBoss;
        ceoBoss.print();
        ceoBoss.goPublic();

        for (Employee employee : employees) {
            System.out.print(employee.getFio() + " : ");
            employee.goToVacation();
        }


    }


}
