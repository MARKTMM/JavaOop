/**
 * Created by Mark on 05/02/2024
 * This class is responsible for keeping track of teacher's name salary and id.
 */
public class Teacher {
    // Declare the field
    private int id;
    private String name;
    private int salary;

    /**
     * Creates the new teacher object
     * @param id for the teacher.
     * @param name of the teacher.
     * @param salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id of the teacher.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the teacher.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary() {
        return salary;
    }
}
