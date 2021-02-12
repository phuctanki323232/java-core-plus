package lesson4;

import java.util.Scanner;

public class Activity42 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\n\nOriginal array: ");
        System.out.println("length = " + array.length);
        System.out.print("a[] = ");
        for (int item : array) {
            System.out.print(item + " ");
        }

        int element = 1;
        int[] array2 = new int[n];
        array2[0] = array[0];
        for (int i = 1; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    flag = false;
                    break;
                }
            }
                if (flag) {
                    array2[element] = array[i];
                    element++;
                }
        }
        System.out.println("\n\nArray after remove all duplicate elements: ");
        System.out.println("Length = " + element);
        System.out.print("a[] = ");
        for (int i = 0; i < element; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
