package kz.epam.training;

import kz.epam.training.sortType.*;

import java.util.ArrayList;
import java.util.List;

public class Rector extends Employee implements Sortable {
    private List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee(2, "Armanov", "Ashat", VICE_RECTOR_POSITION));
        employees.add(new Employee(1, "Baigeldinov", "Daryn", DEAN_POSITION));
        employees.add(new Employee(4, "Darynov", "Erlan", HEAD_OF_DEPARTMENT_POSITION));
        employees.add(new Employee(3, "Fazylov", "Ramazan", TEACHER_POSITION));
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
