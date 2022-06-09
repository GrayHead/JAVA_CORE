package lesson2.demo3_extends;

public class SuperUser extends User {
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public SuperUser() {
    }

    public SuperUser(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    @Override
    public String toString() {
        return "SuperUser{" + "role='" + role + '\'' + "} " + super.toString();
    }

    @Override
    public void greeting() {
        System.out.println("hi!!!");
    }

    public void foo() {

    }


}
