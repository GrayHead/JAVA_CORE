package lesson2.demo9_generics;

public class Main {
    public static void main(String[] args) {

//        User user = new User(1, "vasya");
//        User user2 = new User("#$%^&*9gyg", "vasya");
//
//        User[] users = {user, user2};
//
//        for (User u : users) {
//            if (u.id instanceof String) {
//                String id = (String) u.id;
//                System.out.println(id.contains("1235"));
//            }
//
//        }

        User<String> stringUser = new User<>("qweqweqew", "asudaysfd");
        User<Integer> integerUser = new User<>(1, "qweyqwfeyv");
        User[] users = {stringUser, integerUser};

        for (User user : users) {

            if (user.id instanceof String) {
                System.out.println(((String) user.id).contains("qwtdqwe"));
            }


        }


    }
}
