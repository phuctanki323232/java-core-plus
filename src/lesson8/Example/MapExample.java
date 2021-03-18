package lesson8.Example;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // Key: duy nhat, Value co the trung

        map.put("Hoang", 1);
        map.put("Vi", 2);
        map.put("Quang", 3);
        map.put("Triet", 4);

        System.out.println("Map size: " + map.size());

        /*Integer stt = map.get("Quang");
        System.out.println("Stt truoc: " + stt);*/

        map.put("Quang", 2);
        map.put("Phuc", 5);

        /*System.out.println("Map size 2: " + map.size());
        Integer stt2 = map.get("Quang");
        System.out.println("STT sau: " + stt2);*/

        List<Integer> values = map.values().stream().collect(Collectors.toList());
        for (Integer item : values) {
            System.out.println(item);
        }

        List<String> result = new ArrayList<>();

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            if (value.equals(2)){
                result.add(key);
            }
        }

    }
}
