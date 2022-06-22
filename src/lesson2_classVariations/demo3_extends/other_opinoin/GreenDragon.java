package lesson2_classVariations.demo3_extends.other_opinoin;

public class GreenDragon extends Forest {
    public GreenDragon(int dmg, int def, Type type) {
        super(dmg, def, type);
    }

    @Override
    public void castSpell() {
        System.out.println("hit armagedon");
    }
}
