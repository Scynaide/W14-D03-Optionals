import javax.lang.model.element.Name;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Classroom {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Omar", 49, "Berlin");

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Alice", 20, 88.5,"Berlin"),
                new Student("Bob", 22, 75.0,"Berlin"),
                new Student("Charlie", 23, 92.0,"Berlin"),
                new Student("David", 21, 84.0,"Berlin"),
                new Student("Eve", 22, 90.5,"Berlin"),
                new Student("Greg", 25, 88.5,"Berlin"),
                new Student("Bobby", 22, 75.0,"Berlin"),
                new Student("Zygmunt", 27, 92.0,"Berlin"),
                new Student("Kazimierz", 21, 84.0,"Berlin"),
                new Student("Ewa", 23, 91.5,"Berlin"),
                new Student("Alicja", 23, 88.5,"Berlin"),
                new Student("George", 22, 75.0,"Berlin"),
                new Student("Simon", 33, 92.0,"Berlin"),
                new Student("Sven", 19, 74.0,"Berlin"),
                new Student("Steven", 26, 95.0,"Berlin"),
                new Student("Anthony", 20, 88.5,"Berlin"),
                new Student("John", 22, 75.0,"Berlin"),
                new Student("Jack", 24, 92.5,"Berlin"),
                new Student("Ann", 26, 84.5,"Berlin"),
                new Student("Elis", 29, 90.5,"Berlin")
        ));

        Stream<Student> studentStream = students.stream();
        Stream<Teacher> Teacher = Stream.empty();


        System.out.println(teacher);
        System.out.println("---------------------------------------------------------");



        students.forEach((oneStudent)->{
            System.out.println(oneStudent);
        });

        System.out.println("---------------------------1.1---------------------------");

        students.stream()
                .filter(oneStudent->oneStudent.getAge()>=24)
                .forEach(System.out::println);

        System.out.println("---------------------------1.2---------------------------");

        students.stream()
                .sorted(Comparator.comparingDouble((student)->student.getGrade()))
                .forEach(oneStudent-> System.out.println(oneStudent));

        System.out.println("---------------------------1.3---------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------2.4---------------------------");

        Double averageValue = students.stream()
                .mapToDouble(grade -> grade.getGrade())
                .average()
                .orElse(Double.NaN);

        System.out.println(averageValue);

        System.out.println("---------------------------2.5---------------------------");

















    }

}
