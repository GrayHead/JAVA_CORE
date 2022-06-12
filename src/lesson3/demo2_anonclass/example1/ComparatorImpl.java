package lesson3.demo2_anonclass.example1;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
