package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];


        employees[0] = new Employee("Петя Петрович", "Инженер", "petya@mail.com", "88005553535", 30000, 30);
        employees[1] = new Employee("Петров Петя", "Программист", "petrovpetya@mail.com", "88005553535", 50000, 25);
        employees[2] = new Employee("Сидорова Мария", "Аналитик", "sidorovamaria@mail.com", "88005553535", 45000, 28);
        employees[3] = new Employee("Кузнецов Сергей", "QA", "kuznetsovsergei@mail.com", "88005553535", 40000, 35);
        employees[4] = new Employee("Алексеева Анна", "Дизайнер", "alekseevaanna@mail.com", "88005553535", 35000, 29);

        for (Employee employee : employees) {
            employee.print();
            System.out.println();
        }
    }
}
