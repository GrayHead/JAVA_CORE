package lesson4_collections.stream_06;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        System.out.println(users);

//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getId() == 2) {
//                iterator.remove();
//            }
//        }


//        users.removeIf(user -> user.getName().length() > 6);
//        System.out.println(users);

//        Stream<User> stream = users.stream();
//        stream
//                .distinct()
//                .sorted(Comparator.comparingInt(User::getId))
//                .filter(user -> user.getName().length() > 5)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        List<String> collect = users.stream()
                .distinct()
                .map(user -> user.getId() + ":" + user.getName())
                .collect(Collectors.toList());


        collect
                .forEach(System.out::println);


    }
}
