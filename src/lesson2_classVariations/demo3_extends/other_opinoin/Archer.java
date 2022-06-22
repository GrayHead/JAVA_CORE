package lesson2_classVariations.demo3_extends.other_opinoin;

public class Archer extends Forest {

    public Archer(int dmg, int def, Type type) {
        super(dmg, def, type);
    }

    @Override
    public void castSpell() {
        System.out.println("spell of double arrow");
    }
}
