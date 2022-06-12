package lesson1.demo6_arrays_loop_if;

public class Main {
    public static void main(String[] args) {
        //                    0     1       2
        String[] strings = {"asd", "qwe", "zxc"};
        System.out.println(strings.length); // 3
        strings[0] = "poipoi";
        System.out.println(strings[0]);
//        strings[3] = "new value";
        System.out.println("****1");
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            System.out.println(string);

        }
        System.out.println("****2");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("****3");
        int i = 0;
        while (i < strings.length) {
            System.out.println(strings[i]);
//            if (i == 0) {
//                System.out.println("asdfhgafds");
//            }else if() {
//
//            }

            switch (i) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;

                case 5:
                case 6:
                    System.out.println("another");
                    break;

            }
            i++;
        }


    }
}
