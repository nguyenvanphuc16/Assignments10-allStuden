package Student_ver4;

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
                    System.out.println("Enter student GPA:");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Enter student major:");
                    String major = scanner.nextLine();
                    Student student = new Student(studentId, studentName, dobStudent, gpa, major);
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
                    System.out.println("Enter teaching subject:");
                    String subject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherId, teacherName, dobTeacher, department, subject);
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
                        System.out.println("No students available.");
                    }
                    break;
                case 7:
                    System.out.println("Enter department to search:");
                    String searchDepartment = scanner.nextLine();
                    Teacher teacherByDept = personList.findTeacherByDepartment(searchDepartment);
                    if (teacherByDept != null) {
                        teacherByDept.displayInfo();
                    } else {
                        System.out.println("No teachers found for this department.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }
}
