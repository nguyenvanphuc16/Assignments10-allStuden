
package Student_ver3;
import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> danhSachNguoi;

    public PersonList() {
        this.danhSachNguoi = new ArrayList<>();
    }

    public void themSinhVien(Student sinhVien) {
        danhSachNguoi.add(sinhVien);
    }

    public void themGiaoVien(Teacher giaoVien) {
        danhSachNguoi.add(giaoVien);
    }

    public void capNhatNguoi(String id, Person nguoiMoi) {
        for (int i = 0; i < danhSachNguoi.size(); i++) {
            if (danhSachNguoi.get(i).getId().equals(id)) {
                danhSachNguoi.set(i, nguoiMoi);
                return;
            }
        }
        System.out.println("khong tim thay nguoi co ma " + id);
    }

    public void xoaNguoiTheoId(String id) {
        danhSachNguoi.removeIf(nguoi -> nguoi.getId().equals(id));
    }

    public Person timNguoiTheoId(String id) {
        for (Person nguoi : danhSachNguoi) {
            if (nguoi.getId().equals(id)) {
                return nguoi;
            }
        }
        return null;
    }

    public void hienThiTatCa() {
        for (Person nguoi : danhSachNguoi) {
            nguoi.hienThiThongTin();
            System.out.println("-----------------------");
        }
    }

    public Student timSinhVienTop() {
        Student sinhVienTop = null;
        for (Person nguoi : danhSachNguoi) {
            if (nguoi instanceof Student) {
                Student sinhVien = (Student) nguoi;
                if (sinhVienTop == null || sinhVien.getGpa() > sinhVienTop.getGpa()) {
                    sinhVienTop = sinhVien;
                }
            }
        }
        return sinhVienTop;
    }

    public Teacher timGiaoVienTheoKhoa(String khoa) {
        for (Person nguoi : danhSachNguoi) {
            if (nguoi instanceof Teacher) {
                Teacher giaoVien = (Teacher) nguoi;
                if (giaoVien.getKhoa().equals(khoa)) {
                    return giaoVien;
                }
            }
        }
        return null;
    }
}


