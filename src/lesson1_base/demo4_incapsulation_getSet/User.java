package lesson1_base.demo4_incapsulation_getSet;

public class User {
    int id;
    private String name;
    private boolean status;
    private double weight;


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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("ERRROR");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
