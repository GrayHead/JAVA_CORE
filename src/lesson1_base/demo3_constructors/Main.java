package lesson1_base.demo3_constructors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.id = 1;
        user1.name = "vaysa";
        user1.status = true;
        user1.weight = 87.5;
        System.out.println(user1);

        User user2 = new User(2, "kokos", false, 55.5);
        System.out.println(user2);




    }
}
