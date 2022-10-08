package lesson3_interface.demo1_inteface.other_opinoin;

public class Garpy extends Dungeon {

    public Garpy(int dmg, int def, Type type) {
        super(dmg, def, type);
    }

    @Override
    public void portal() {
        System.out.println("lost 10 unit");
    }
}
