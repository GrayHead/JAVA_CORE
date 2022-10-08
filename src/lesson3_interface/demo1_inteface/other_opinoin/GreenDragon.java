package lesson3_interface.demo1_inteface.other_opinoin;

public class GreenDragon extends Forest implements Dragon {
    public GreenDragon(int dmg, int def, Type type) {
        super(dmg, def, type);
    }

    @Override
    public void castSpell() {
        System.out.println("hit armagedon");
    }

    @Override
    public void fireBreath() {
        System.out.println("aisdgahgsfdhsagd");
    }
}
