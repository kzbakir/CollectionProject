package kz.epam.training.sortType;

import kz.epam.training.Employee;
import java.util.Comparator;

public class PositionSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Employee.getPositionPriority().get(o1.getPosition()) - Employee.getPositionPriority().get(o2.getPosition());
    }

}
