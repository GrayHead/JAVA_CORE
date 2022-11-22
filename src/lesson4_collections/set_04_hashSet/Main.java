package lesson4_collections.set_04_hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        HashSet<String> strings = new HashSet<>();
//        strings.add("asdqwe");
//        strings.add("asd");
//        strings.add("qwe");
//        strings.add("okten");
//        System.out.println(strings);


        HashSet<User> users = new HashSet<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        users.add(new User(6, "mango"));

        System.out.println(users);




    }
}
