package lesson2_classVariations.demo1_composition_agregation;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class User {
    private int id;
    private String name;

    private Passport passport;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String series, String number) {
        this.id = id;
        this.name = name;
        this.passport = new Passport(series, number);
    }

    public User(int id, String name, Passport passport) {
        this.id = id;
        this.name = name;
        this.passport = passport;
    }
}
