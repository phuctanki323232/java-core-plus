package lesson3;

import java.util.Scanner;
// đổi tên biên hàng loạt: Shift F6
public class BreakExample {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so");
            number = scanner.nextInt();

            if (number < 0) {
                break;
            }
            sum += number;
        } while (number >= 0);
        System.out.println("Ket qua = " + sum);
    }
}
