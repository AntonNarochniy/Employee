package kg.megacom.employee;

import kg.megacom.employee.childs.CEO;
import kg.megacom.employee.childs.Developer;
import kg.megacom.employee.childs.Manager;
import kg.megacom.employee.childs.Specialist;

public class Main {

    public static void main(String[] args) {


        Specialist specIvanov = new Specialist("Иванов", 19, 1000, 1);
        Specialist specPetrov = new Specialist("Петров", 20, 2000, 2);
        Specialist specSidorov = new Specialist("Сидоров", 25, 3000, 3);
        specIvanov.print();
        specPetrov.print();
        specSidorov.print();
        specIvanov.workWithClients();
        Developer devAibek = new Developer("Курманалиев Айбек", 22, 10000, Grades.JUNIOR);
        Developer devAida = new Developer("Таласбаева Аида", 25, 20000, Grades.MIDDLE);
        Developer devAndrey = new Developer("Коробов Андрей", 30, 30000, Grades.SENIOR);
        Developer devMichael = new Developer("Michael Katzman", 40, 80000, Grades.TEAMLEAD);
        devAibek.print();
        devAida.print();
        devAndrey.print();
        devMichael.print();
        devMichael.writeCode();
        Manager managerBarno = new Manager("Сагатова Барно", 31, 20000, false);
        Manager managerAnara = new Manager("Токталиева Анара", 30, 20000, false);
        managerAnara.print();
        managerBarno.print();
        managerAnara.writeProcedures();
        CEO ceoBoss = new CEO("Директоров Директрбек", 50, 2000000, true, true);
        ceoBoss.print();
        ceoBoss.goPublic();

        System.out.println();

        // ДЗ 23.1 - добавил вызовы метода goToDayOff()

        specIvanov.goToDayOff();
        specPetrov.goToDayOff();
        specSidorov.goToDayOff();
        devAibek.goToDayOff();
        devAida.goToDayOff();
        devMichael.goToDayOff();
        devAndrey.goToDayOff();
        managerAnara.goToDayOff();
        managerBarno.goToDayOff();
        ceoBoss.goToDayOff();
        System.out.println("\n \n");

        //ДЗ 28.1  распечатал поле phrase при помощи цикла и метода printPhrase()
            for (Grades g : Grades.values()) {
                g.printPhrase();
            }







    }


}



