// Student.java
public class Student {
    private String studentId;
    private String name;
    private int age;
    private int attendance;

    public Student(String studentId, String name, int age, int attendance) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.attendance = attendance;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nName: " + name + "\nAge: " + age + "\nAttendance: " + attendance;
    }
}
