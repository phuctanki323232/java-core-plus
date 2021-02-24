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

        System.out.print("Nhap so luong sv: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten sv thu " + (i+1)+ ": ");
            String name = scanner.nextLine();
            System.out.print("Nhap gpa sv thu " + (i+1)+ ": ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();

            students[i] = new Student(name, gpa);
        }

        StudentManagement st = new StudentManagement(students);

        Student highestStudent = st.SvGpaMax();
        System.out.println("Sv cao nhat:");
        highestStudent.printInfo();

        Student lowestStudent = st.SvGpaMin();
        System.out.println("\nSv thap nhat:");
        lowestStudent.printInfo();

        System.out.println("\nSố Sv pass: " + st.soSvPass());
        System.out.println("Số Sv khong pass: " + st.soSvNotPass());
    }
}
