package Student_ver2;

import java.util.Date;

public class Student extends Person implements IPerson {

    private float gpa;
    private String major;
    private double tuition = 10000000;
    private boolean scholarship;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        this.scholarship = gpa >= 9.0;
        this.calculateTuition();
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
        this.scholarship = gpa >= 9.0;
        this.calculateTuition();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return tuition;
    }

    public boolean hasScholarship() {
        return scholarship;
    }

    public void calculateTuition() {
        if (scholarship) {
            this.tuition = 10000000 * 0.5;
        } else {
            this.tuition = 10000000;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Scholarship: " + (scholarship ? "Yes" : "No"));
        System.out.println("Tuition: " + tuition);
    }

}