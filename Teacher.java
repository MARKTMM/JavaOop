/**
 * Created by Mark on 05/02/2024
 * This class is responsible for keeping track of students fees,name, id, grade & fees paid.
 */
public class Teacher {
    // Declare the field
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
