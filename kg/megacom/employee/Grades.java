package kg.megacom.employee;

import kg.megacom.employee.childs.Developer;

public enum Grades {
    JUNIOR("My grade is JUNIOR"),
    MIDDLE("My grade is MIDDLE"),
    SENIOR("My grade is SENIOR"),
    TEAMLEAD("MY GRADE IS TEAMLEAD");

    //ДЗ 28.1 создал поле phrase, конструктор и метод printPhrase()
    String phrase;

    Grades(String phrase) {
        this.phrase = phrase;
    }

    public void printPhrase() {
        System.out.println(phrase); ;
    }


}
