package lesson5_io.exceptions_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        try {
//            Files.list(Paths.get(System.getProperty("user.hoe")));
//        } catch (IOException | NullPointerException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("end");


        try {
            calc(10, 0);
        } catch (IndexOutOfBoundsException e) {

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void calc(int a, int b) throws RuntimeException, IndexOutOfBoundsException {
        if (b == 0) {
            throw new RuntimeException();
        }
        System.out.println(a / b);
    }
}

