package lesson8.Example;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(7);

        for (Integer element : linkedList) {
            System.out.println(element);
        }

        linkedList.remove(2);
        for (Integer e : linkedList) {
            System.out.println(e);
        }
    }
}
