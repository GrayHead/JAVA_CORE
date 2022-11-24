package lesson5_io.nio_03;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Path sszhu = Paths.get(System.getProperty("user.home"));
//        Stream<Path> stream = Files.list(sszhu);
//        stream.forEach(file -> System.out.println(file));

//        System.out.println(sszhu.toAbsolutePath());

        Path oktenTXT = Paths.get(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");
//        List<String> lines = Files.readAllLines(oktenTXT);
//        lines.forEach(System.out::println);

        String msg = "dsuytwertufkskgfd";
        byte[] msgBytes = msg.getBytes(StandardCharsets.UTF_8);
        Files.write(oktenTXT, msgBytes, StandardOpenOption.APPEND);


    }
}
