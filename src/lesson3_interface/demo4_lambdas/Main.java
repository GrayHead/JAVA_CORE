package lesson3_interface.demo4_lambdas;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = (a, b) -> {
            System.out.println();
            return a + b;
        };

        Calculator calculator1 = (a, b) -> a / b;

        foobar(10,20,(a, b) -> a*b);

    }


    public static void foobar(int a, int b, Calculator calculator) {
        calculator.calculate(a, b);
    }
}
