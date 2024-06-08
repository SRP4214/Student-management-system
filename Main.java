// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("        Student Management System          ");
            System.out.println();
            System.out.println("  1. Add Student");
            System.out.println("  2. Find Student");
            System.out.println("  3. Display All Students");
            System.out.println("  4. Display All Detained Students");
            System.out.println("  5. Save Students to File");
            System.out.println("  6. Load Students from File");
            System.out.println("  7. Exit");
            System.out.println();
            System.out.print("  Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("--> Enter Student ID: ");
                    scanner.nextLine();
                    String studentId = scanner.nextLine();
                    System.out.println();
                    System.out.print("--> Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println();
                    System.out.print("--> Enter Age: ");
                    int age = scanner.nextInt();

                    System.out.println("--> Enter days student attended: ");
                    int attendance = scanner.nextInt();
                    System.out.println("--> Enter total days: ");
                    int day = scanner.nextInt();

                    studentManager.addStudent(studentId, name, age, attendance * 100 / day);
                    break;

                case 2:
                    System.out.println();
                    System.out.print(" >> Enter Student ID to find: ");
                    scanner.nextLine();
                    String searchId = scanner.nextLine();
                    System.out.println();
                    Student foundStudent = studentManager.findStudent(searchId);
                    if (foundStudent != null) {
                        System.out.println("--> Student Found:");
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("--> Student not found.");
                    }
                    System.out.println();

                    break;
                case 3:
                    System.out.println();
                    System.out.println("  All Students: ");
                    studentManager.displayAllStudents();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("      All Detained Students       ");
                    studentManager.displayDetainedStudents();
                    break;

                case 5:
                    System.out.print("Enter the name of the file to save student information: ");
                    scanner.nextLine();
                    String saveFileName = scanner.nextLine();
                    FileHandler.saveStudentsToFile(saveFileName, studentManager.getStudents());
                    break;
                case 6:
                    System.out.print("Enter the name of the file to load student information: ");
                    scanner.nextLine();
                    String loadFileName = scanner.nextLine();
                    FileHandler.loadStudentsFromFile(loadFileName, studentManager);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("  Invalid choice. Please Try again.");
                    System.out.println();
            }
        }
    }
}
