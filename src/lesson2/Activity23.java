package lesson2;

import java.util.Scanner;

public class Activity23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a number: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
