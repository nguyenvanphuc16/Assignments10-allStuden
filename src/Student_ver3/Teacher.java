
package Student_ver3;

import java.util.Date;

public class Teacher extends Person implements IPerson {
    private String khoa;
    private String monDay;

    public Teacher(String id, String hoTen, Date ngaySinh, String khoa, String monDay) {
        super(id, hoTen, ngaySinh);
        this.khoa = khoa;
        this.monDay = monDay;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Ma giao vien: " + id);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Khoa: " + khoa);
        System.out.println("Mom day: " + monDay);
    }
}

