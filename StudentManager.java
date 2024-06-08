// StudentManager.java
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String studentId, String name, int age, int attendance) {
        Student student = new Student(studentId, name, age, attendance);
        students.add(student);
    }

    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println();
            System.out.println(student);
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println();
        }
    }

    public void displayDetainedStudents() {
        for (Student student : students) {
            if (student.getAttendance() < 85) {
                System.out.println();
                System.out.println(student);
                System.out.println();
                System.out.println("-----------------------------------");
                System.out.println();
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
