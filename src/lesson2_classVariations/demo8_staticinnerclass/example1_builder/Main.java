package lesson2_classVariations.demo8_staticinnerclass.example1_builder;

public class Main {
    public static void main(String[] args) {

        User kokos = User.builder().id(10).name("kokos").build();
//        System.out.println(kokos);
        User asdgyafs = User.builder().id(10).name("asdgyafs").build();

    }
}
