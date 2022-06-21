package lesson1_base.demo5_lombok;

public class Main {
    public static void main(String[] args) {

        new User();

        User user2 = new User(2, "kokos", false, 55.5);
        System.out.println(user2);




    }
}
