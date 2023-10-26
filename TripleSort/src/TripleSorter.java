import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TripleSorter {
    public static String sort(List<Student> students) {
        List<Student> sortedStudents = students.stream()
                .sorted(
                        Comparator.comparing(Student::getGpa).reversed()
                                .thenComparing(student -> student.getFullName().split(" ")[1].charAt(0))
                                .thenComparing(Student::getAge)
                )
                .collect(Collectors.toList());
        return sortedStudents.stream()
                .map(Student::getFullName)
                .collect(Collectors.joining(","));
    }
}



