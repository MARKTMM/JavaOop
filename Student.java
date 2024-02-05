import java.util.Locale;

/**Created by Mark on 05/02/2024
 * This class is responsible for keeping track of students fees,name, id, grade & fees paid.
 */
public class Student {

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
}
