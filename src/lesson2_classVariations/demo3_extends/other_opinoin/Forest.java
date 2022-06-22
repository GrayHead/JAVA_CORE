package lesson2_classVariations.demo3_extends.other_opinoin;

public abstract class Forest extends Unit {
    public String buff = "def bonus 20%";

    public Forest(int dmg, int def, Type type) {
        super(dmg, def, type);
    }

    public abstract void castSpell();
}
