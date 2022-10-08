package lesson3_interface.demo1_inteface.other_opinoin;

public class Main {
    public static void main(String[] args) {

        Archer archer = new Archer(100, 20, Type.DISTANCE);
        GreenDragon greenDragon = new GreenDragon(200, 300, Type.FLY);
        Forest[] forestUnits = {archer, greenDragon};


        Garpy garpy = new Garpy(140, 60, Type.FLY);
        BlackDragon blackDragon = new BlackDragon(220, 280, Type.FLY);
        Dungeon[] dungeonUnit = {blackDragon, garpy};


        Unit[] units = {archer, blackDragon, garpy, greenDragon};

        Dragon[] dragons = {blackDragon, greenDragon};

        Dragon dragon = dragons[0];
        BlackDragon blackDr = (BlackDragon) dragon;


    }
}
