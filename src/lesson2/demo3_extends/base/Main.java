package lesson2.demo3_extends.base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SuperUser superUser = new SuperUser();
        superUser.greeting();
        superUser.foo();

        User user = new SuperUser();
        SuperUser superUser1 = (SuperUser) user;
        superUser1.foo();

        ArrayList<User> users = new ArrayList<>();
        users.add(superUser);
        users.add(user);

        SuperUser superUser2 = (SuperUser) users.get(0);
        superUser2.foo();



    }
}
