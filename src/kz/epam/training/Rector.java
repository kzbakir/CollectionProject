package kz.epam.training;

import kz.epam.training.sortType.*;
import java.util.ArrayList;
import java.util.List;

public class Rector implements Sortable {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(2, "Armanov", "Ashat", Employee.VICE_RECTOR_POSITION));
        employees.add(new Employee(1, "Baigeldinov", "Daryn", Employee.DEAN_POSITION));
        employees.add(new Employee(4, "Darynov", "Erlan", Employee.HEAD_OF_DEPARTMENT_POSITION));
        employees.add(new Employee(3, "Fazylov", "Ramazan", Employee.TEACHER_POSITION));
    }

    @Override
    public void sortById() {
        System.out.println("\nID SORT: ");
        employees.sort(new IdSorter());
        for (Employee e : employees) {
            e.print();
        }
    }

    @Override
    public void sortByPosition() {
        System.out.println("\nPosition Sort: ");
        employees.sort(new PositionSorter());
        for (Employee e : employees) {
            e.print();
        }
    }

    @Override
    public void sortByFirstName() {
        System.out.println("\nFirst Name Sort: ");
        employees.sort(new FirstNameSorter());
        for (Employee e : employees) {
            e.print();
        }
    }

        @Override
        public void sortByLastName() {
            System.out.println("\nLast Name Sort: ");
            employees.sort(new LastNameSorter());
            for (Employee e : employees) {
                e.print();
            }
        }
}
