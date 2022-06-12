package lesson3.demo2_anonclass.example1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(123345);
        integers.add(8477);
        integers.add(-8477);
        integers.add(0);
        System.out.println(integers);

//        ComparatorImpl comparator = new ComparatorImpl();
//        integers.sort(comparator);

        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(integers);

        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(integers);

    }
}
