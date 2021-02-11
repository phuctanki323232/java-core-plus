package lesson2;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        System.out.println(n + " + " + (n * 11) + " + " + (n * 111) + " = " + (n * 123));
    }
}
