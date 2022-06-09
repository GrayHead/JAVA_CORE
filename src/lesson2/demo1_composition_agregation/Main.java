package lesson2.demo1_composition_agregation;

public class Main {
    public static void main(String[] args) {


        Passport passport = new Passport("asdasdqwe", "21198137c");
        User user = new User(1, "vasya", passport);


        User user2 = new User(1, "vasya", "qweqew","q715462r7263");
        Passport passport1 = user2.getPassport();


        Customer customer = new Customer("asd", "qwe", passport1);

    }
}
