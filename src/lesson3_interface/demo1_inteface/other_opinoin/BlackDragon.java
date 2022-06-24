package lesson3_interface.demo1_inteface.other_opinoin;

import java.io.Serializable;

public class BlackDragon extends Dungeon implements Dragon, Serializable {

    public BlackDragon(int dmg, int def, Type type) {
        super(dmg, def, type);
    }

    @Override
    public void portal() {
        System.out.println("lost 1 unit");
    }

    public void fireBreath() {
        System.out.println("hit with fire with dmg - " + dmg);
    }



}
