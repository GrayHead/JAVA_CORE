package lesson1_base.demo2_baseType_createObject;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.id = 1;
        user.name = "vaysa";
        user.status = true;
        user.weight = 87.5;
//        System.out.println(user.id + " " + user.name + " " + " " + user.status + " " + user.weight);
        System.out.println(user);

    }
}
