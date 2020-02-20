import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee implements Comparable<Employee> {
    private int id;
    private String lastName;
    private String firstName;
    private String position;
    final static public String POSITION_JUNIOR = "Junior Java Developer";
    final static public String POSITION_MIDDLE = "Middle Java Developer";
    final static public String POSITION_SENIOR = "Senior Java Developer";
    final static public String POSITION_LEAD = "Team Lead";
    public static Map<String , Integer> positionPriority = new HashMap<>();
    static {
        positionPriority.put(POSITION_JUNIOR,1);
        positionPriority.put(POSITION_MIDDLE,2);
        positionPriority.put(POSITION_SENIOR,3);
        positionPriority.put(POSITION_LEAD,4);
    }


    public Employee(){};
    public Employee(int id, String lastName, String firstName, String position){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    public void show(){
        System.out.println("id: " + id);
        System.out.println("lasName: " + lastName);
        System.out.println("firstName: " + firstName);
        System.out.println("position: " + position);
    }

    @Override
    public int compareTo(Employee o) {
        return positionPriority.get(o.position) - positionPriority.get(this.position);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

//    @Override
//    public List
}
