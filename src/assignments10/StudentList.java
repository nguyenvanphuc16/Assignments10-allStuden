package assignments10;

import java.util.ArrayList;

class StudentList {

    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }

    public Student findStudentByID(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)){
            return student;
        }
    }
        return null;
    }
    public void displayAllStudents() {
        for (Student student : studentList) {
           student.displayInfo();
        }
    }      
        public Student findTopStudent() {
        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println( );
        
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
            return topStudent;
        }

    Student findStudentById(String updateId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
} 



