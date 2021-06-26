import java.util.*;
import java.util.stream.Collectors;

public class StudentManagement {

    private List<Student> students;

    public StudentManagement(List<Student> students){
        this.students = students;
    }

    public void printAllEngineeringDepartments()
    {
        this.students.stream()
                .map(student -> student.getDept())
                .distinct()
                .forEach(System.out::println);
    }

    public List<String> joinedAfterEnrollmentYear(int year)
    {
        return this.students.stream()
                .filter(student -> student.getJoinedYear() == year)
                .map(student -> student.getName())
                .collect(Collectors.toList());
    }

    public List<Student> filterByGenderAndDepartment(String gender, String engineeringDepartment)
    {
        return this.students.stream()
                .filter(student -> student.getGender().equals(gender))
                .filter(student -> student.getDept().equals(engineeringDepartment))
                .collect(Collectors.toList());
    }

    public Map<String, Long> countBasedOnGender()
    {
        return this.students.stream()
                .collect(Collectors.groupingBy(
                        student -> student.getGender(),
                        Collectors.counting()
                ));
    }

    public Map<String, Double> averageAgeByGender()
    {
        return this.students.stream()
                .collect(Collectors.groupingBy(
                        student -> student.getGender(),
                        Collectors.averagingInt(Student::getAge)
                ));
    }

    public Student getDetailsOfHighestPercentage()
    {
        return this.students.stream()
                .filter(student ->
                        student.getCgpaUpdated()
                                ==
                                this.students.stream()
                                        .mapToDouble(student1 -> student1.getCgpaUpdated())
                                        .max().getAsDouble()
                )
                .collect(Collectors.toList())
                .get(0);
    }

    public Map<String, Long> countBasedOnDepartments()
    {
        return this.students.stream()
                .collect(Collectors.groupingBy(
                        student -> student.getDept(),
                        Collectors.counting()
                ))
                ;
    }

    public Map<String, Long> countByGenderBasedOnDepartments(String department)
    {
        return this.students.stream()
                .filter(student -> student.getDept().equals(department))
                .collect(Collectors.groupingBy(
                        student -> student.getGender(),
                        Collectors.counting()
                ));
    }

    public Map<String, Double> averageBasedOnDepartment()
    {
        return this.students.stream()
                .collect(Collectors.groupingBy(
                        student -> student.getDept(),
                        Collectors.averagingDouble(Student::getCgpaUpdated)
                ));
    }

    public Student findYoungestBasedOnGenderAndDepartment(String gender, String department)
    {
        return this.students.stream()
                .filter(student -> student.getGender().equals(gender))
                .filter(student -> student.getDept().equals(department))
                .collect(Collectors.minBy(
                        (x, y) -> x.getJoinedYear() - y.getJoinedYear()
                )).get();
    }
}