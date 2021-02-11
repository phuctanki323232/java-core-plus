package lesson3;

import java.util.Scanner;

public class IfElseIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao diem GPA: ");
        Float gpa = scanner.nextFloat();

        if (gpa < 6.0f) {
            System.out.println("Hoc luc trung binh");
        } else if (gpa < 8.0f) {
            System.out.println("Hoc luc loai kha");
        } else {
            System.out.println("Hoc luc loai xuat sac");
        }
        System.out.println("Ket thuc");
    }
}
