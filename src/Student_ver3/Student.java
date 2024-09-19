
package Student_ver3;

import java.util.Date;

public class Student extends Person implements IPerson {
    private float gpa;
    private String chuyenNganh;

    public Student(String id, String hoTen, Date ngaySinh, float gpa, String chuyenNganh) {
        super(id, hoTen, ngaySinh);
        this.gpa = gpa;
        this.chuyenNganh = chuyenNganh;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("GPA: " + gpa);
        System.out.println("Chuyên ngành: " + chuyenNganh);
    }
}

