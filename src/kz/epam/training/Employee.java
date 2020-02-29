package kz.epam.training;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private String position;
    public final static String RECTOR_POSITION = "Rector";
    public final static String VICE_RECTOR_POSITION = "Vice Rector";
    public final static String DEAN_POSITION = "Dean";
    public final static String HEAD_OF_DEPARTMENT_POSITION = "Head of department";
    public final static String TEACHER_POSITION = "Teacher";
    private static Map<String , Integer> positionPriority = new HashMap<>();

    public Employee(){};

    public Employee(int id, String lastName, String firstName, String position){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    static {
        positionPriority.put(VICE_RECTOR_POSITION, 4);
        positionPriority.put(DEAN_POSITION, 3);
        positionPriority.put(HEAD_OF_DEPARTMENT_POSITION, 2);
        positionPriority.put(TEACHER_POSITION, 1);
    }

    public void print(){
        System.out.println("\nid: " + id);
        System.out.println("lasName: " + lastName);
        System.out.println("firstName: " + firstName);
        System.out.println("position: " + position);
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public static Map<String, Integer> getPositionPriority() {
        return positionPriority;
    }
}
