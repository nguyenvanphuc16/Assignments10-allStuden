package Student_ver2;

import java.util.ArrayList;

public class StudentList {

    private ArrayList<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void deleteStudentById(String id) {
        this.studentList.removeIf(student -> student.getId().equals(id));
    }

    public Student findStudentById(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println("---------------------------");
        }
    }

    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            return null;
        }

        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public ArrayList<Student> findScholarshipStudents() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.hasScholarship()) {
                scholarshipStudents.add(student);
            }
        }
        return scholarshipStudents;
    }

    public double calculateTuitionOfAllStudents() {
        double totalTuition = 0;
        for (Student student : studentList) {
            totalTuition += student.getTuition();
        }
        return totalTuition;
    }
}
