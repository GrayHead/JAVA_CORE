package lesson5_io.io_02;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
//        Properties properties = System.getProperties();
//        for (Object o : properties.keySet()) {
//            System.out.println(o + " -  " + System.getProperty((String) o));
//        }

//        File oktenTXT_file = new File(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");
//        FileInputStream fileInputStream = new FileInputStream(oktenTXT_file);
//        byte[] bytes = new byte[fileInputStream.available()];
//        fileInputStream.read(bytes);
//        String s = new String(bytes);
//        System.out.println(s);
//
//        fileInputStream.close();


//        File sszhu = new File(System.getProperty("user.home"));
//        if (sszhu.isDirectory()) {
//            File[] files = sszhu.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }


        File oktenTXT_file = new File(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(oktenTXT_file, true);
        fileOutputStream.write("asufyqwtfe".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();




    }
}
