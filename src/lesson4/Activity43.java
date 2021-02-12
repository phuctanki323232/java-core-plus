package lesson4;

import java.util.Scanner;

public class Activity43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the 1st array: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter elements of the 1st array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the 2st array: ");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        System.out.println("Enter elements of the 2st array: ");
        for (int i = 0; i < m; i++) {
            System.out.print("a[" + i + "] = ");
            array2[i] = scanner.nextInt();
        }

        System.out.println("\n\nOriginal array: ");
        System.out.println("length = " + array1.length);
        System.out.print("element = ");
        for (int item : array1) {
            System.out.print(item + " ");
        }

        System.out.println("length = " + array2.length);
        System.out.print("element = ");
        for (int item : array2) {
            System.out.print(item + " ");
        }

        int[] arrayMerged = new int[m + n];
        if (n >= 0) System.arraycopy(array1, 0, arrayMerged, 0, n);
        if (m >= 0) System.arraycopy(array2, 0, arrayMerged, n, m);

        System.out.println("\n\nMerged array: ");
        System.out.println("Length = " + (m + n));
        System.out.print("element = ");
        for (int item : arrayMerged) {
            System.out.print(item + " ");
        }
    }
}
