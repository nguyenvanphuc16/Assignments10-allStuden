package Student_ver3;

import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList danhSachNguoi = new PersonList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Them giao vien moi");
            System.out.println("3. Cap nhap them ");
            System.out.println("4. Xoa theo ma");
            System.out.println("5. Tim theo ma");
            System.out.println("6. Hien thi ta ca sinh vien va giao vien");
            System.out.println("7. Tim sinh vien co GPA cao nhat");
            System.out.println("8. Tim giao vien theo khoa");
            System.out.println("9. OUT");

            int luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    
                    System.out.println("Nhap thong tin sinh vien (ma, Ho ten, Ngay sinh, Gpa, chuyen nganh): ");
                    String id = scanner.nextLine();
                    String hoTen = scanner.nextLine();
                    Date ngaySinh = new Date();  
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();
                    String chuyenNganh = scanner.nextLine();
                    Student sinhVien = new Student(id, hoTen, ngaySinh, gpa, chuyenNganh);
                    danhSachNguoi.themSinhVien(sinhVien);
                    break;
                case 2:
                    
                    System.out.println("Nhập thông tin giáo viên ((ma, Ho ten, Ngay sinh, khoa, mon day): ");
                    id = scanner.nextLine();
                    hoTen = scanner.nextLine();
                    ngaySinh = new Date();  
                    String khoa = scanner.nextLine();
                    String monDay = scanner.nextLine();
                    Teacher giaoVien = new Teacher(id, hoTen, ngaySinh, khoa, monDay);
                    danhSachNguoi.themGiaoVien(giaoVien);
                    break;
                case 3:
                    
                    System.out.println("Nhap ma nguoi can xoa: ");
                    id = scanner.nextLine();
                    
                    break;
                case 4:
                 
                    System.out.println("Nhap ma nguoi can xoa: ");
                    id = scanner.nextLine();
                    danhSachNguoi.xoaNguoiTheoId(id);
                    break;
                case 5:
                    System.out.println("Nhap ma nguoi can tim: ");
                    id = scanner.nextLine();
                    Person nguoiTimThay = danhSachNguoi.timNguoiTheoId(id);
                    if (nguoiTimThay != null) {
                        nguoiTimThay.hienThiThongTin();
                    } else {
                        System.out.println("Khong tim thay nguoi.");
                    }
                    break;
                case 6:
                    danhSachNguoi.hienThiTatCa();
                    break;
                case 7:
                    Student sinhVienTop = danhSachNguoi.timSinhVienTop();
                    if (sinhVienTop != null) {
                        System.out.println("Sinh vien co Gpa cao nhat: ");
                        sinhVienTop.hienThiThongTin();
                    } else {
                        System.out.println("Khong co sinh vien nao trong ds.");
                    }
                    break;
                case 8:
                    System.out.println("Nhap khoa can tim giao vien: ");
                    String khoaTimKiem = scanner.nextLine();
                    Teacher giaoVienTheoKhoa = danhSachNguoi.timGiaoVienTheoKhoa(khoaTimKiem);
                    if (giaoVienTheoKhoa != null) {
                        System.out.println("Giao vien thuoc khoa " + khoaTimKiem + ": ");
                        giaoVienTheoKhoa.hienThiThongTin();
                    } else {
                        System.out.println("Khong tim thay giao vien thuoc khoa " + khoaTimKiem);
                    }
                    break;

                case 9:
                    System.out.println("Ket thuc chuong trinh.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le!! Vui long chon lai.");
                    break;
            }
        }
    }
}
