package module7;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;

public class ImmutableTest {
    public static void main(String[] args) {
//        Time time = new Time(1, 5, 8);
//        Time time1 = new Time(2, 7, 15);
//        System.out.println("time = " + time);
//        System.out.println("time1 = " + time1);
//        Time sum = time.addTime(time1);
//        System.out.println("time = " + time);
//        System.out.println("sum = " + sum);
//        time1.getMinutes();

//        Time [] loops = {
//            new Time(1, 5, 8),
//                    new Time(12, 2, 6),
//        };
//        Stopwatch stopwatch = new Stopwatch(loops);
//        loops[1] = new Time(15, 15, 14);
//        System.out.println("stopwatch = " + stopwatch);
//        Time[] loops1 = stopwatch.getLoops();
//        loops1[0] = new Time(8, 7, 5);
//        System.out.println("stopwatch = " + stopwatch);

//
//        Date date = new Date();
//        PaymentTransaction transaction = new PaymentTransaction(
//                new BigDecimal("50.5"),
//                date
//        );
//        System.out.println("transaction = " + transaction);
//        date.setTime(15000000);
//        System.out.println("transaction = " + transaction);

//        String str = "default";
//        String str1 = "default";

        byte [] arr = {74, 65, 86, 65};
        String str = new String(arr, StandardCharsets.UTF_8);
        System.out.println("str = " + str);
        byte[] bytes = str.getBytes();
        System.out.println("bytes = " + Arrays.toString(bytes));
        DatabaseConnection.getInstance();
    }
}
