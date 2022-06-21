package lesson3_interface.demo1_inteface.base;

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
