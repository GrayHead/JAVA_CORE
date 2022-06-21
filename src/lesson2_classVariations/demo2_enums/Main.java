package lesson2_classVariations.demo2_enums;

public class Main {
    public static void main(String[] args) {

//        Role role = Role.ADMIN;


//        User user = new User("asd", Role.MANAGER);
//
//        Helper helper = new Helper();
//        String extractToken = helper.extractToken(user);
//        System.out.println(extractToken);

        Role[] values = Role.values();
        System.out.println(Role.SUPERVISER.ordinal());


    }
}
