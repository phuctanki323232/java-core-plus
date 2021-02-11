package lesson3;

import java.util.Scanner;

public class Activity33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int number = scanner.nextInt();

        System.out.print("Binary number is: ");
        int binaryNumber;
        do {
            binaryNumber = number % 2;
            number /= 2;
            System.out.print(binaryNumber);
        } while (number != 0);
    }
}
