package lesson8.Activity;

import java.util.ArrayList;
import java.util.LinkedList;

public class Activity81 {
    public static void main(String[] args) {
        long start, finish;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // tinh thoi gian truy cap
        // Test ArrayList
        start = System.nanoTime();
        arrayList.get(50000);
        finish = System.nanoTime();
        System.out.println("time Array get MIDDLE element: " + (finish - start));

        // Test linkedList
        start = System.nanoTime();
        linkedList.get(50000);
        finish = System.nanoTime();
        System.out.println("time Linked get MIDDLE element: " + (finish - start));

        // tinh thoi gian them phan tu
        start = System.nanoTime();
        arrayList.set(50000, 10);
        finish = System.nanoTime();
        System.out.println("\ntime Array set MIDDLE element: " + (finish - start));

        start = System.nanoTime();
        linkedList.set(50000, 10);
        finish = System.nanoTime();
        System.out.println("time Linked set MIDDLE element: " + (finish - start));

        // Tinh thoi gian xoa phan tu giua
        start = System.nanoTime();
        arrayList.remove(50000);
        finish = System.nanoTime();
        System.out.println("\ntime Array remove MIDDLE element: " + (finish - start));

        start = System.nanoTime();
        linkedList.remove(50000);
        finish = System.nanoTime();
        System.out.println("time Linked remove MIDDLE element: " + (finish - start));

        // Tinh thoi gian them phan tu ở giữa
        start = System.nanoTime();
        arrayList.add(5, 50000);
        finish = System.nanoTime();
        System.out.println("\ntime Array add MIDDLE element: " + (finish - start));

        start = System.nanoTime();
        linkedList.add(5, 50000);
        finish = System.nanoTime();
        System.out.println("time Linked add MIDDLE element: " + (finish - start));
    }
}
