package lesson8.Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        // khai bao
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        //ArrayList myArrayList = new ArrayList<>();
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(5);

        //Duyet
        // foreach
        for (Integer element : myArrayList) {
            System.out.println(element);
        }

        // Truy voa tung phan tu cua mang
        System.out.println(myArrayList.get(1));

        // Them 1 phan tu
        myArrayList.add(4);
        myArrayList.add(1, 4);

        // Xoa 1 phan tu
        myArrayList.remove(0);

        System.out.println("Array size: " + myArrayList.size());

        ArrayList<Integer> myArrayList2 = new ArrayList<>();
        myArrayList2.add(1);

        // gop mang 1 va 2
        myArrayList2.addAll(myArrayList);
        System.out.println("Array2 size: " + myArrayList2.size());

        // tim kiem phan tu
        if (myArrayList2.contains(5)){
            System.out.println("Mang chua phan tu 5");
        }

        // kiem tra collection trong
        if (myArrayList.isEmpty()){
            System.out.println("Mang rong");
        } else {
            System.out.println("Mang co phan tu");
        }
    }
}
