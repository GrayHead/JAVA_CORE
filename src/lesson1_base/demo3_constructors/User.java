package lesson1_base.demo3_constructors;

public class User {
    int id;
    String name;
    boolean status;
    double weight;


    public User() {
    }

    public User(int id, String name, boolean status, double weight) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.weight = weight;
    }

    public User(String name, boolean status, double weight) {
        this.name = name;
        this.status = status;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", status=" + status + ", weight=" + weight + '}';
    }
}
