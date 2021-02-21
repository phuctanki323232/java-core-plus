/*Viết hàm main để test:
        + Nhập vào thông tin sinh viên.
        + In ra tổng số sinh viên đỗ.
        + In ra tổng số sinh viên trượt.
        + In ra thông tin sinh viên có điểm GPA cao nhất.
        + In ra thông tin sinh viên có điểm GPA thấp nhất.*/

package lesson5;

import java.util.Scanner;

public class Activity52_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so sinh vien: ");
        int n = scanner.nextInt();
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.n = n;
        // Nhap Thong tin Sinh vien
        studentManagement.nhapThongtin();

        // In ra tổng số sinh viên đỗ.
        System.out.print("\nTong so sinh vien do: " + studentManagement.soSvPass());

        // In ra tổng số sinh viên trượt.
        System.out.print("\nTong so sinh vien truot: " + studentManagement.soSvNotPass());

        // In ra thông tin sinh viên có điểm GPA cao nhất.
        studentManagement.SvGpaMax();

        // In ra thông tin sinh viên có điểm GPA thấp nhất.
        studentManagement.SvGpaMin();
    }
}
