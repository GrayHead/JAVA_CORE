package lesson2_classVariations.demo9_generics;

public class User<ID> {
    ID id;
    String name;

    public User(ID id, String name) {
        this.id = id;
        this.name = name;
    }
}
