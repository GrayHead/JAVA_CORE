package lesson1_base.demo7_arrayInObject;

public class Main {
    public static void main(String[] args) {


//        String[] skills = new String[500];
//        skills[0] = "asdad";
//        skills[1] = "qewwqe";
//        User user = new User(1, "vasya", skills);
//        System.out.println(user);
        User user = new User(1, "kokos");
        user.addSkill(0,"html");
        user.addSkill(1,"java");
        System.out.println(user);


    }
}
