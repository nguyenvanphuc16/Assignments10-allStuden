package Student_ver2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Them student");
            System.out.println("2. Cap nhap student boi id");
            System.out.println("3. Xoa student boi id");
            System.out.println("4. Hien thi tat ca sinh vien");
            System.out.println("5. Tim sinh vien co diem Gpa cao nhat");
            System.out.println("6. Hien thi sinh vien co hoc bong");
            System.out.println("7. Hien thi tong hoc phi cua tat ca sinh vien");
            System.out.println("0. OUT");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Nhap ID: ");
                    String id = scanner.next();
                    System.out.println("Ho Va Ten: ");
                    String fullName = scanner.next();
                    System.out.println("Nhap nam thang ngay (yyyy-mm-dd): ");
                    String dobString = scanner.next();
                    Date dateOfBirth = null;

                    try {
                        dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(dobString);
                    } catch (ParseException e) {
                        System.out.println("Ngày sinh không hợp lệ. Vui lòng nhập đúng định dạng yyyy-mm-dd.");
                        break;
                    }
                    System.out.println("Nhap GPA: ");
                    float gpa = scanner.nextFloat();
                    System.out.println("Nhap nganh hoc: ");
                    String major = scanner.next();
                    Student student = new Student(id, fullName, dateOfBirth, gpa, major);
                    studentList.addStudent(student);
                    break;
                case 2:
                    System.out.println("Nhap ID can cap nhap: ");
                    String updateId = scanner.next();
                    Student updateStudent = studentList.findStudentById(updateId);
                    if (updateStudent != null) {
                        System.out.println("Nhap GPA moi: ");
                        float newGpa = scanner.nextFloat();
                        updateStudent.setGpa(newGpa);
                        System.out.println("CAP NHAP THANH CONG!");
                    } else {
                        System.out.println("KHONG TIM THAY SINH VIEN!");
                    }
                    break;
                case 3:
                    System.out.println("Nhap Id can xoa: ");
                    String deleteId = scanner.next();
                    studentList.deleteStudentById(deleteId);
                    System.out.println("DA XOA SINH VIEN!");
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Sinh vien co GPA cao nhat: ");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("Khong co sinh vien nao!!!");
                    }
                    break;
                case 6:
                    ArrayList<Student> scholarshipStudents = studentList.findScholarshipStudents();
                    if (!scholarshipStudents.isEmpty()) {
                        System.out.println("Danh sach sinh vien co hoc bong: ");
                        for (Student s : scholarshipStudents) {
                            s.displayInfo();
                            System.out.println("---------------------------");
                        }
                    } else {
                        System.out.println("Khong co sinh vien nao co hoc bong");
                    }
                    break;
                case 7:

                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Tong hoc phi cua tat ca sinh vien: " + totalTuition);
                    break;
                case 0:

                    System.out.println("Thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long sua lai!");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
