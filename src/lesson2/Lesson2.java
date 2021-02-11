package lesson2;

import java.util.Scanner;

public class Lesson2 {

    // biến local
    int instacceVariable = 100;
    int b;

    static int number = 100; // biến static
    static final int constant = 200; // hằng số

    public static void main(String[] args) {

        // khai báo
        /*int a = 10;
        int b, c = 20;
        float d = 20.4f;

        System.out.println(a * 2);
        System.out.println(a * 10);
        System.out.println(a + 10);*/

        // các kiểu dữ liệu
        /*//1 bit => 2 giá trị
        // *
        // 0/1
        // cmt nhiều dòng: CTRL SHIFT ?
        boolean flag = false;
        boolean flag2 = true;

        // byte: 8 bit
        // **** **** => 2^8 = 256 giá trị
        // 1010 1111
        // dấu: x** **** => 2^7 = 128 giá trị mỗi nửa
        byte maxByte2 = 127; // 0 -> 127 = 2^7 - 1
        byte minByte2 = -128; // -1 -> -128 = -2^7

        // int: 32 bit => 4 byte
        minInt: -2^31
        maxInt: 2^31 - 1

        // long: 64 bit
        // minLong: -2^63
        // maxLong: 2^63 - 1

        // float: 32 bit => 4 byte
        float A = 3.5f; // k có đuôi mặc định là double
        float A1 = (float) 3.5; // ép kiểu
        double B = 3.5;

        System.out.println("Gia tri cua A = " + A);

        char X = 'a';

        String y = "phuc";
        System.out.println("Ten tui la: " + y);*/

        // biến instance
        /*int a = 10;
        int b = 20;
        //System.out.println(a * b);

        Lesson2 lesson2 = new Lesson2();
        lesson2.printSomething();
        int result = lesson2.getIntNumber();
        System.out.println(result);*/

        // widening
        /*byte a = 10;
        int b = a;
        System.out.println(b);*/

        // narrowing
        /*int c = 25; //
        byte d = (byte) c;
        System.out.println(d);*/

        // toán tử
        /*int a = 10;
        int b = 20;
        int c = b++;// gán trước rồi mới cộng
        int d = --b; // trừ trước rồi mới gán

        boolean result = a == 10 && b == 20;
        System.out.println(result);
        boolean result2 = !(a == 10);
        System.out.println(result2);

        String result3 = (a == 10) ? "A = 10" : "A khac 10";
        System.out.println(result3);

        // a = 10 => 1010 = 2^3 + 2^1
        int e = a >> 1; // 101 = 2^2 + 2^0*/

        // Nhập xuất dữ liệu
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ten: ");
        String name = scanner.nextLine();
        System.out.println("Ten vua nhap la: " + name);

        System.out.println("Nhap vao so thuc A: ");
        float a = scanner.nextFloat();
        System.out.println("So vua nhap la: " + a);*/
    }

    // Phương thức, hàm, function, method
    /*void printSomething() {
        int aInSomeThing = number;
        System.out.println("Print something");
        System.out.println("Inside method");
        System.out.println(instacceVariable);
    }

    int getIntNumber() {
        int aIntNumber = 10;
        return aIntNumber * instacceVariable;
    }*/
}
