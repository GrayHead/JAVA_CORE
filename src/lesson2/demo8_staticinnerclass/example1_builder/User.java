package lesson2.demo8_staticinnerclass.example1_builder;

import lombok.Builder;

@Builder
public class User {
    private int id;
    private String name;

//    public static class Builder {
//
//        private User user = new User();
//
//        public Builder id(int id) {
//            user.id = id;
//            return this;
//
//        }
//
//        public Builder name(String name) {
//            user.name = name;
//            return this;
//        }
//
//        public User build() {
//            return user;
//        }
//
//
//    }
//
//    public static Builder builder() {
//        return new Builder();
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
