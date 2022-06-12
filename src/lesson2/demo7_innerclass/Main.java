package lesson2.demo7_innerclass;

public class Main {
    public static void main(String[] args) {


        Wrap wrap = new Wrap(0);

        Wrap.AddOperations addOperations = wrap.new AddOperations();

        addOperations.addOne();
        addOperations.addTwo();
        System.out.println(wrap.getX());

        Wrap.RemoveOperations removeOperations = wrap.new RemoveOperations();
        removeOperations.removeTwo();
        System.out.println(wrap.getX());



    }
}
