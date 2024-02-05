import java.util.Locale;

/**
 * Created by Mark on 05/02/2024
 * This class is responsible for keeping track of students fees,name, id, grade & fees paid.
 */
public class Student {
    // Declare the field
        private int id;
        private String name;
        private int grade;
        private int feesPaid;
        private int feesTotal;


    /**
     * Role of a constructor is to create a new object by initializing it.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
        }

    // Not going to change or alter student's name and id.

    /**
     * Used to update student's grade.
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees paid field.
     * Add the fees to fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void updateFeesPaid(int fees) {
        this.feesPaid = fees;
    }




}
