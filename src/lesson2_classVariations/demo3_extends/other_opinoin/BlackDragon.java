package lesson2_classVariations.demo3_extends.other_opinoin;

public class BlackDragon extends Dungeon {

    public BlackDragon(int dmg, int def, Type type) {
        super(dmg, def, type);
    }

    @Override
    public void portal() {
        System.out.println("lost 1 unit");
    }
}
