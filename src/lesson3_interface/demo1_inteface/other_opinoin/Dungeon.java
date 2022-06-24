package lesson3_interface.demo1_inteface.other_opinoin;

public abstract class Dungeon extends Unit {
    public String bonus = " hit forest unit twice";

    public Dungeon(int dmg, int def, Type type) {
        super(dmg, def, type);
    }


    public abstract void portal();
}
