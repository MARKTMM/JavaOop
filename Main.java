import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melisa = new Teacher(2, "Mellisa", 200);
        Teacher jeniffer = new Teacher(3, "Jeniffer", 5000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melisa);
        teacherList.add(jeniffer);

        Student mark = new Student(1, "Mark", 4);
        Student claire = new Student(2, "Claire", 12);
        Student annette = new Student(3, "Annette", 8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(mark);
        studentList.add(claire);
        studentList.add(annette);


        School tm = new School(teacherList,studentList);
        System.out.println(tm.getTotalMoneyEarned());
    }
}
