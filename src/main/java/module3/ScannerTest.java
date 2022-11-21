package module3;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        InputStream sin = System.in;
//        Scanner scanner = new Scanner(sin);

        //String line = scanner.nextLine(); // delimiter characters \n
//        int nextInt = scanner.nextInt(); // ' ' \t \n
//        System.out.println("number = " + nextInt);
//        scanner.close();

        int res = new ScannerTest().multiplier();
        System.out.println("res = " + res);

    }

    public int multiplier() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        return a * b * c;
    }


}
