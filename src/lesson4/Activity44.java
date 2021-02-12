package lesson4;

import java.util.Scanner;

public class Activity44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array inputed: ");
        for (int item : array) {
            System.out.print(item + " ");
        }

        // Find max
        int posMax = 0;
        int max;
        max = array[0];
        for (int i = 1; i < n; i++){
            if (max < array[i]){
                max = array[i];
                posMax = i;
            }
        }
        System.out.println("\n\nValue Max = " + max);
        System.out.println(" Position Max element = " + posMax);

        //Find min
        int posMin = 0;
        int min;
        min = array[0];
        for (int i = 1; i < n; i++){
            if (min > array[i]){
                min = array[i];
                posMin = i;
            }
        }
        System.out.println("\nValue Min = " + min);
        System.out.println("Position Min element = " + posMin);

        // Find Max2
        int posMax2 = 0;
        int max2 = array[0];
        for (int i = 0; i < n; i++){
            if (i == posMax) continue;
            if (max2 < array[i]){
                max2 = array[i];
                posMax2 = i;
            }
        }
        System.out.println("\nValue 2nd max = " + max2);
        System.out.println("Position 2nd Max element = " + posMax2);

        // Find min 2
        int posMin2 = 0;
        int min2 = array[0];
        for (int i = 0; i < n; i++){
            if (i == posMin) continue;
            if (min2 > array[i]){
                min2 = array[i];
                posMin2 = i;
            }
        }
        System.out.println("\nValue 2nd min = " + min2);
        System.out.println("Position 2nd Min element = " + posMin2);

        //replace
        int[] array2 = new int[n];
        System.arraycopy(array, 0, array2, 0, n);
        for (int i = 0; i < n; i++) {
            if (array2[i] < 0) {
                array2[i] = 0;
            }
        }
        System.out.print("\nArray after replace: ");
        for(int item : array2) {
            System.out.print(item + " ");
        }

        // sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("\n\nArray after sorted: ");
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}