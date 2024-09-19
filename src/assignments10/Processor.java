
package assignments10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws ParseException {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {            
            System.out.println("1. Them hoc sinh moi ");
            System.out.println("2. Cap nhat hoc sinh theo ID ");
            System.out.println("3. Xoa hoc sinh theo ID ");
            System.out.println("4. Hien thi tat ca hoc sinh ");
            System.out.println("5. GPA cao nhat ");
            System.out.println("6. Thoat ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice){
                case 1:
                    try {
                    System.out.println("Nhap ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Nhap ho va ten:");
                    String fullName = scanner.nextLine();
                    System.out.println("Nhap ngay thang nam sinh:");
                    String dob = scanner.nextLine();
                    Date dateOfBirth = sdf.parse(dob); 
                    System.out.println("Nhap GPA:");
                    float gpa = scanner.nextFloat();
                    System.out.println("Nhap nganh:");
                    scanner.nextLine();  
                    String major = scanner.nextLine();
                    Student newstudent = new Student(gpa,  major,  id,  fullName,  dateOfBirth);
                    studentList.addStudent(newstudent);
                    System.out.println("DA THEM HOC SINH THANH CONG! ");
                    }catch (ParseException e) {
                    System.out.println("Sai dinh dang ngay.");
                    }
                    break;
        
                case 2:
                    System.out.print("Nhap ID sinh vien de cap nhap:");
                    String updateId = scanner.nextLine();
                    Student updateStudent = studentList.findStudentById(updateId);
                    if (updateStudent != null) {
                        System.out.print("Nhap ho va ten moi: ");
                        String newfullName = scanner.nextLine();
                        updateStudent.setfullName(newfullName);
                        System.out.print("nhap GPA moi: ");
                        float newGpa = scanner.nextFloat();
                        updateStudent.setGpa(newGpa);
                        scanner.nextLine(); 
                        System.out.print("Nhap chuyen nganh moi: ");
                        String newMajor = scanner.nextLine();
                        updateStudent.setMajor(newMajor);
                        System.out.println("* DA CAP NHAP THANH CONG *");
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;

                case 3:
                   
                    System.out.print("Nhap ID sinh vien can xoa : ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudentById(deleteId);
                    System.out.println("DA XOA HOC SINH THANH CONG! ");
                    break;

                case 4:
                   
                    studentList.displayAllStudents();
                    break;

                case 5:
                    
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Hoc sinh gioi nhat:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("Khong tim thay hoc sinh nao.");
                    }
                    break;

                case 6:
                    
                    System.out.println("DANG THOAT....");
                    scanner.close();
                    return;

                default:
                    System.out.println("TUY CHON KHONG HOP LE, VUI LONG THU LAI! ");
            }
        }
    }
}