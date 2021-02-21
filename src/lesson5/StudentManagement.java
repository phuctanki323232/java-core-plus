/*Viết lớp StudentManagement gồm có:
        - Các thuộc tính:
        + Tổng số sinh viên n.
        + Danh sách sinh viên (Student[] students).
        - Các phương thức:
        + Nhập vào thông tin từng sinh viên khi khởi tạo lớp.
        + Đếm tổng số sinh viên đỗ.
        + Đếm tổng số sinh viên trượt.
        + Tìm sinh viên có điểm gpa cao nhất.
        + Tìm sinh viên có điểm gpa thấp nhất.*/

package lesson5;

import java.util.Scanner;

public class StudentManagement {
    public int n; // so Sinh vien
    private Student[] students;

    // Nhập vào thông tin từng sinh viên khi khởi tạo lớp.
    public void nhapThongtin() {
        Scanner scanner = new Scanner(System.in);
        students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten sinh vien thu " + (i+1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhap GPA sinh vien thu " +(i+1) +": ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();

            students[i] = new Student(name, gpa);
        }
    }

    // Đếm tổng số sinh viên đỗ.
    public int soSvPass() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(students[i].checkPass()){
                count++;
            }
        }
        return count;
    }

    // Đếm tổng số sinh viên trượt.
    public int soSvNotPass(){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (students[i].checkPass() == false) {
                count++;
            }
        }
        return count;
    }

    // Tìm sinh viên có điểm gpa cao nhất.
    public void SvGpaMax(){
        Student gpaMax = students[0];
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (gpaMax.getGpa() < students[i].getGpa()){
                gpaMax = students[i];
                max = i;
            }
        }
        System.out.println("\n\nSinh vien co Gpa lon nhat:");
        students[max].printInfo();
    }

    // Tìm sinh viên có điểm gpa thấp nhất.
    public void SvGpaMin() {
        Student gpaMin = students[0];
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (gpaMin.getGpa() > students[i].getGpa()){
                gpaMin = students[i];
                min = i;
            }
        }
        System.out.println("\nSinh vien co Gpa bé nhat:");
        students[min].printInfo();
    }
}
