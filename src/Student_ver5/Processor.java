package Student_ver5;

import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Check book borrowing status");
            System.out.println("0. Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter student ID:");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter student full name:");
                    String studentName = scanner.nextLine();
                    Date dobStudent = new Date();
                    System.out.println("Enter GPA:");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Enter major:");
                    String major = scanner.nextLine();
                    Student student = new Student(studentId, studentName, dobStudent, gpa, major, new Date(), new Date());
                    personList.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter teacher ID:");
                    String teacherId = scanner.nextLine();
                    System.out.println("Enter teacher full name:");
                    String teacherName = scanner.nextLine();
                    Date dobTeacher = new Date();
                    System.out.println("Enter department:");
                    String department = scanner.nextLine();
                    System.out.println("Enter subject:");
                    String subject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherId, teacherName, dobTeacher, department, subject, new Date(), new Date());
                    personList.addTeacher(teacher);
                    break;
                case 3:
                    System.out.println("Enter person ID to update:");
                    String updateId = scanner.nextLine();
                    personList.updatePerson(updateId);
                    break;
                case 4:
                    System.out.println("Enter person ID to delete:");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;
                case 5:
                    personList.displayEveryone();
                    break;
                case 6:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top student:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 7:
                    System.out.println("Enter department:");
                    String searchDept = scanner.nextLine();
                    Teacher foundTeacher = personList.findTeacherByDepartment(searchDept);
                    if (foundTeacher != null) {
                        foundTeacher.displayInfo();
                    } else {
                        System.out.println("No teachers found in this department.");
                    }
                    break;
                case 8:
                    personList.checkBookBorrowing();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);

        scanner.close();
    }
}
