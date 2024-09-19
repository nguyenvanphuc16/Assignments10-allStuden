
package Student_ver5;
import java.util.Date;

class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    @Override
    public void addPerson() {
        System.out.println("New teacher added.");
    }

    @Override
    public void updatePerson(String id) {
        if (this.id.equals(id)) {
            System.out.println("Teacher updated.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + teachingSubject);
        if (isBookOverdue()) {
            System.out.println("Book status: Overdue");
        } else {
            System.out.println("Book status: No overdue");
        }
    }
}
