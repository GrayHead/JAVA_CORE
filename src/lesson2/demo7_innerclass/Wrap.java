package lesson2.demo7_innerclass;

public class Wrap {
    private int x;

    public Wrap(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    class AddOperations {

        public void addOne() {
            x = x + 1;
        }

        public void addTwo() {
            x = x + 2;

        }

    }

    class RemoveOperations {

        public void removeOne() {
            x = x - 1;
        }

        public void removeTwo() {
            x = x - 2;

        }

    }


}
