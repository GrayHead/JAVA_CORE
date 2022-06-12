package lesson2.demo8_staticinnerclass;

public class Wrap {
     static int x;

    public Wrap(int x) {
        this.x = x;
    }



    static class AddOperations {

        public void addOne() {
            x = x + 1;
        }

        public void addTwo() {
            x = x + 2;

        }

    }

    static class RemoveOperations {

        public void removeOne() {
            x = x - 1;
        }

        public void removeTwo() {
            x = x - 2;

        }

    }


}
