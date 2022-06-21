package lesson2_classVariations.demo6_static;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        System.out.println(User.COUNTER);

    }
}
