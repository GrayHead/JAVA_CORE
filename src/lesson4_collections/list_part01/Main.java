package lesson4_collections.list_part01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1001);//0
        integers.add(1002);//1
        integers.add(1003);//2
        integers.add(1004);//3
        integers.add(1005);//4
        System.out.println(integers);

        Integer integer = integers.get(1);// 1002
        integers.sort((o1, o2) -> o1 - o2);

//        integers.forEach(integer1 -> System.out.println(integer1));
//        for (Integer i : integers) {
//            if (i % 2 == 0) {
//                integers.remove(i);
//            }
//
//        }


        integers.removeIf(next -> next % 2 == 0);
        System.out.println(integers);

    }
}
