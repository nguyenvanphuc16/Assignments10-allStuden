
package assignments10;

import java.text.SimpleDateFormat;
import java.util.Date;

class Student extends Person implements IPerson{
    private float gpa;
    private String major;
    
    public Student(float gpa, String major, String id, String fullname, Date dateOfBirth) {
        super(id, fullname, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(dateOfBirth);

        System.out.println("ID: "+ id);
        System.out.println("Full Name: "+ fullname);
        System.out.println("Date Of Birth: "+ dateOfBirth);
        System.out.println("GPA: "+ gpa);
        System.out.println("Major: "+ major);
    }
       
    public void AddStudent(){
        System.out.println("ID: "+ id);
        System.out.println("Full Name: "+ fullname);
        System.out.println("Date Of Birth: "+ dateOfBirth);
        System.out.println("GPA: "+ gpa);
        System.out.println("Major: "+ major);
    }

    void setfullName(String newfullName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
     
}
