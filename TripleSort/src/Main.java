import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(22, 90, "Roi Foodman"));
        students.add(new Student(22, 90, "Ben Pose"));
        students.add(new Student(22, 90, "Jane Doe"));
        students.add(new Student(25, 88, "Reed Zapata"));

        System.out.println(TripleSorter.sort(students));
    }
}