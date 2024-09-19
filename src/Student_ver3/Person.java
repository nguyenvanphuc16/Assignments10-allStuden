
package Student_ver3;
import java.util.Date;

public abstract class Person {
    protected String id;
    protected String hoTen;
    protected Date ngaySinh;

    public Person(String id, String hoTen, Date ngaySinh) {
        this.id = id;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public abstract void hienThiThongTin();
}

