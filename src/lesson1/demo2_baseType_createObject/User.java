package lesson1.demo2_baseType_createObject;

public class User {
    int id;
    String name;
    boolean status;
    double weight;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", weight=" + weight +
                '}';
    }
}
