package kz.epam.training.sortType;

import kz.epam.training.Employee;
import java.util.Comparator;

public class IdSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() - o2.getId();
    }
}
