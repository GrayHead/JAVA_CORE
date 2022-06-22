package lesson2_classVariations.demo3_extends.other_opinoin;

public abstract class Unit {
    public int dmg;
    public int def;
    public Type type;


    public Unit(int dmg, int def, Type type) {
        this.dmg = dmg;
        this.def = def;
        this.type = type;
    }
}
