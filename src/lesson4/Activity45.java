package lesson4;

import java.util.Scanner;

public class Activity45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String chuoi = scanner.nextLine();

        int length = chuoi.length();
        char[] characters = chuoi.toCharArray();
        System.out.print("Reverse of that string is: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(characters[i]);
        }
    }
}
