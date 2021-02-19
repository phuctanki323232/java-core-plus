package lesson5;

import java.util.Scanner;

public class Activity51_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Activity51_Rectangle rectangle = new Activity51_Rectangle();
        System.out.print("Nhap vao chieu dai: ");
        float height = scanner.nextFloat();
        rectangle.setHeight(height);
        System.out.print("Nhap vao chieu rong: ");
        float width = scanner.nextFloat();
        rectangle.setWidth(width);

        System.out.println("Kich thuoc cua hinh chu nhat la: ");
        rectangle.printKichthuoc();

        System.out.print("Chu vi: " + rectangle.chuVi());

        System.out.println("\nDien tich: " + rectangle.dienTich());

        if (rectangle.checkHinhVuong()) {
            System.out.println("La hinh vuong!");
        } else {
            System.out.println("Khong la hinh vuong!");
        }
    }
}
