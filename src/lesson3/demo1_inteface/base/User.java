package lesson3.demo1_inteface.base;

public class User implements Singer {
    private String msg;

    @Override
    public void sing() {
        System.out.println("olololololo" + msg + this.greeting());
    }

    public String greeting() {
        return "  hello";
    }
}
