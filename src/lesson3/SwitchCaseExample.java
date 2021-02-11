package lesson3;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao lua chon cua ban");
        System.out.println("1. Dang ky");
        System.out.println("2. Dang nhap");
        System.out.println("3. Reset mat khau");

        Integer option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Nhap vao thong tin dang ky");
                break;
            case 2:
                System.out.println("Nhap vao username, passwork");
                break;
            case 3:
                System.out.println("Nhap vao email");
                break;
            default:
                System.out.println("xin cam on");
                break;
        }
        System.out.println("ket thuc");
    }
}
