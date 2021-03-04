package lesson6.Activity61;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong nv: ");
        int soLuongNhanVien = scanner.nextInt();
        scanner.nextLine();

        NhanVien[] nhanViens = new NhanVien[soLuongNhanVien];

        for (int i = 0; i < soLuongNhanVien; i++){
            System.out.println("Nhap info nv thu " +(i+1) + ": ");
            System.out.print("Nhap ten: ");
            String name = scanner.nextLine();
            System.out.print("Nhap tuoi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap gioi tinh: ");
            String sex = scanner.nextLine();

            System.out.print("Nhap loai nv full/part: ");
            String option = scanner.nextLine();

            if (option.equals("full")) {
                System.out.print("Nhap loai nv LINH/SEP: ");
                String type = scanner.nextLine();
                System.out.print("Nhap so ngay lam them: ");
                int soNgayLamThem = scanner.nextInt();
                scanner.nextLine();

                nhanViens[i] = new NhanVienFullTime(name, age, sex, type, soNgayLamThem);
            }

            if (option.equals("part")) {
                System.out.print("Nhap so gio lam: ");
                int soGioLam = scanner.nextInt();
                scanner.nextLine();

                nhanViens[i] = new NhanVienPartTime(name, age, sex, soGioLam);
            }
        }

        for (NhanVien nhanVien : nhanViens) {
            nhanVien.printInformation();
            System.out.print("Luong: " + nhanVien.tinhLuong() + "\n\n");
        }
    }
}
