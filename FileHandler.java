// FileHandler.java
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileHandler {
    public static void saveStudentsToFile(String fileName, List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.write(student.getStudentId() + "," + student.getName() + "," + student.getAge() + "," + student.getAttendance());
                writer.newLine();
            }
            System.out.println("Student information saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error while saving student information: " + e.getMessage());
        }
    }

    public static void loadStudentsFromFile(String fileName, StudentManager studentManager) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String studentId = parts[0];
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    int attendance = Integer.parseInt(parts[3]);
                    studentManager.addStudent(studentId, name, age, attendance);
                }
            }
            System.out.println("Student information loaded from " + fileName);
        } catch (IOException e) {
            System.err.println("Error while loading student information: " + e.getMessage());
        }
    }
}
