package lesson2_classVariations.demo8_staticinnerclass;

public class Main {
    public static void main(String[] args) {


//        Wrap wrap = new Wrap(0);
//
//        Wrap.AddOperations addOperations = new Wrap(0).new AddOperations();
//
//        addOperations.addOne();
//        addOperations.addTwo();
//        System.out.println(wrap.getX());
//
//        Wrap.RemoveOperations removeOperations = wrap.new RemoveOperations();
//        removeOperations.removeTwo();
//        System.out.println(wrap.getX());


        System.out.println(Wrap.x);
        Wrap.AddOperations addOperations = new Wrap.AddOperations();
        addOperations.addOne();
        addOperations.addOne();
        addOperations.addOne();
        System.out.println(Wrap.x);

        Wrap.RemoveOperations removeOperations = new Wrap.RemoveOperations();
        removeOperations.removeTwo();
        System.out.println(Wrap.x);


    }
}
