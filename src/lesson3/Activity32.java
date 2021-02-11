package lesson3;

import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai day Fibo: ");
        int length = scanner.nextInt();
        int Fibo0 = 0, Fibo1 = 1;
        int Fibon = 1;

        System.out.println("Day Fibo:");
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == 1) System.out.print(i + " ");
            else {
                Fibo0 = Fibo1;
                Fibo1 = Fibon;
                Fibon = Fibo0 + Fibo1;
                System.out.print(Fibon + " ");
            }
        }
    }
}
