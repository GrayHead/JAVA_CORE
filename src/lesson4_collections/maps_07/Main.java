package lesson4_collections.maps_07;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> treeMap = new LinkedHashMap<>();
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);
        treeMap.put("four", 4);

        System.out.println(treeMap);
        Integer one = treeMap.get("one"); // 1
//        Set<Map.Entry<String, Integer>> entries = treeMap.entrySet();

//        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> next = iterator.next();
//            if (next.getKey().equals("one")) {
//                iterator.remove();
//            }
//        }

        treeMap.put("one", 2222);
        System.out.println(treeMap);

        Map<String, Integer> collect = treeMap.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue)
        );


    }
}

