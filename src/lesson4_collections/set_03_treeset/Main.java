package lesson4_collections.set_03_treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<String> strings = new TreeSet<>();
//        strings.add("a");
//        strings.add("c");
//        strings.add("c");
//        strings.add("b");
//        System.out.println(strings);

        Set<User> users = new TreeSet<>();
        users.add(new User(3, "ertert"));
        users.add(new User(1, "asd"));
        users.add(new User(3, "zxc"));
        users.add(new User(2, "qwe"));

        System.out.println(users);


    }
}
