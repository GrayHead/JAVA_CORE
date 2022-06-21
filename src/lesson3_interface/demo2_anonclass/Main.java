package lesson3_interface.demo2_anonclass;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Singer> singers = new ArrayList<>();
//        singers.add(new Student());
//        singers.add(new User());
//
//        Singer singer = singers.get(1);
//        singer.sing();


        Singer singer1 = new Singer() {
            @Override
            public void sing() {
                System.out.println("agdjagdjdasgjh");
            }
        };


        Singer singer2 = new Singer() {
            @Override
            public void sing() {
                System.out.println("foo baaar");
            }
        };

        singer1.sing(); // agdjagdjdasgjh
        singer2.sing(); // foo baaar

    }
}
