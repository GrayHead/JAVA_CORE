package lesson3_interface.demo2_anonclass;

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
