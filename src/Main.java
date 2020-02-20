import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2,"John","Mike",Employee.POSITION_JUNIOR));
        employees.add(new Employee(1,"Smith","Will",Employee.POSITION_MIDDLE));
        employees.add(new Employee(4,"Maksatov","Korabek",Employee.POSITION_SENIOR));
        employees.add(new Employee(3,"Baibekov","Alpamys",Employee.POSITION_LEAD));
        Collections.sort(employees);
        for(Employee e: employees){
            e.show();
        }
    }
}
