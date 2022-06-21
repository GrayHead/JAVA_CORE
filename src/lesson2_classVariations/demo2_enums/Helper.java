package lesson2_classVariations.demo2_enums;

public class Helper {

    public String extractToken(User user) {
        Role role = user.getRole();
        return role.getToken();

    }
}
