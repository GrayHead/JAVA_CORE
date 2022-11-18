package lesson4_collections.list_02_linkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("ashghjsagdj1");
        strings.add("ashghjsagdj2");// set
        strings.add("ashghjsagdj3");
        strings.add("ashghjsagdj4");
        strings.add("ashghjsagdj5");
        strings.set(1, "qwe"); // set


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1001);//0
        integers.add(1002);//1
        integers.add(1003);//2
        integers.add(1004);//3
        integers.add(1005);//4
        System.out.println(integers);


    }
}
