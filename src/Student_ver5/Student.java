
package Student_ver5;
import java.util.Date;

class Student extends Person {
    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void addPerson() {
        System.out.println("New student added.");
    }

    @Override
    public void updatePerson(String id) {
        if (this.id.equals(id)) {
            System.out.println("Student updated.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        if (isBookOverdue()) {
            System.out.println("Book status: Overdue");
        } else {
            System.out.println("Book status: No overdue");
        }
    }
}
