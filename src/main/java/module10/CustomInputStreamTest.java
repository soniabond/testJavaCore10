package module10;

import java.io.*;
import java.util.Scanner;

public class CustomInputStreamTest {
    public static void main(String[] args) {
//        InputStream cis = new CustomInputStream("1557");
//        Scanner scanner = new Scanner(cis);
//        Integer res = scanner.nextInt();
//        System.out.println("res = " + res);

//        File file = new File("test.txt");
//        System.out.println("file.exists() = " + file.exists());
//        System.out.println("file.isDirectory() = " + file.isDirectory());
//        System.out.println("file.isFile() = " + file.isFile());
//        if(file.exists()){
//            try (InputStream fis = new FileInputStream(file);
//                 Scanner scanner = new Scanner(fis)) {
//                while (scanner.hasNext()) {
//                    System.out.println(scanner.nextLine());
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        try(OutputStream fos = new FileOutputStream("outputTest.txt", true)) {
            String dataToWrite = "\nsecond test line";
            fos.write(dataToWrite.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
