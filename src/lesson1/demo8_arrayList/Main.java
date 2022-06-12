package lesson1.demo8_arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        User[] users = new User[2];
//        users[0] = new User(1, "vasya");
//        users[1] = new User(2, "petya");
//        System.out.println(users);
//        System.out.println(Arrays.toString(users));

//        ArrayList<User> users = new ArrayList();
//        users.add(new User(1, "asd"));
//        users.add(new User(2, "qwe"));
//
//        System.out.println(users);
//        System.out.println(users.get(0));
//        System.out.println(users.size());

        User vasya = new User(1, "vasya");
        ArrayList<String> skills = vasya.getSkills();
        skills.add("java");
        skills.add("java 2");
        skills.add("java 8");
        skills.add("java 9");
        skills.add("java 17");
        System.out.println(vasya);
        skills.remove(0);
        System.out.println(vasya);


    }
}
