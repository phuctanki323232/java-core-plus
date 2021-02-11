package lesson4;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        // khởi tạo mảng 1 chiều
        /*int array[];
        int[] array2;

        array = new int[5];
        array2 = new int[]{4, 1, 3, 6, 5};
        array = new int[]{1, 2, 3, 4, 5};*/

        // Nhập giá trị mảng
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu: ");
        int n = scanner.nextInt();
        String arrayStr[] = new String[n];

        array[0] = 10;
        array[3] = 5;

        int zeroIndex = array[0];
        System.out.println(zeroIndex);

        int size = array.length;
        System.out.println(size);*/

        // duyệt mảng
        /*for (int i = 0; i < array.length; i++) {
            System.out.println("Gia tri phan tu thu " + (i + 1) + " la " + array[i]);
        }

        for (int item : array) {
            System.out.println("Gia tri phan tu la: " + item);
        }*/

        // Tham chiếu
        int n = 5;
        int[] array = new int[1];
        array[0] = 7;

        System.out.println("Before tham tri: " + n);
        thamTri(n);
        System.out.println("After tham tri: " + n);

        System.out.println("Before tham chieu:" + array[0]);
        thamChieu(array);
        System.out.println("After tham chieu: " + array[0]);
    }
    private static void thamTri(int n){
        n = 10;
    }
    private static void  thamChieu(int[] array){
        array[0] = 20;
    }

}
