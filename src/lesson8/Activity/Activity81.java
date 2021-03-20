package lesson8.Activity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Activity81 {
    public static void main(String[] args) {
        int n = 100000;
        long start;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // tinh thoi gian truy cap
        // Test ArrayList
        start = System.nanoTime();
        arrayList.get(n / 2);
        System.out.println("time Array get MIDDLE element: " + (System.nanoTime() - start));

        // Test linkedList
        start = System.nanoTime();
        linkedList.get(n / 2);
        System.out.println("time Linked get MIDDLE element: " + (System.nanoTime() - start));

        // tinh thoi gian them phan tu
        start = System.nanoTime();
        arrayList.set(n / 2, 10);
        System.out.println("\ntime Array set MIDDLE element: " + (System.nanoTime() - start));

        start = System.nanoTime();
        linkedList.set(n / 2, 10);
        System.out.println("time Linked set MIDDLE element: " + (System.nanoTime() - start));

        // Tinh thoi gian xoa phan tu giua
        start = System.nanoTime();
        arrayList.remove(n / 2);
        System.out.println("\ntime Array remove MIDDLE element: " + (System.nanoTime() - start));

        start = System.nanoTime();
        linkedList.remove(n / 2);
        System.out.println("time Linked remove MIDDLE element: " + (System.nanoTime() - start));
    }
}
