package module11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class WhoOwesMeMoneyTask {
    public static void main(String[] args) {
        Map<String, Integer> personDebt = new HashMap<>();
        try (InputStream fis = new FileInputStream("whoOwesMe.txt");
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] splitedLine = line.split(" ");
                String name = splitedLine[0];
                int money = Integer.parseInt(splitedLine[1]);
                if(personDebt.containsKey(name)) {
                    int currDebt = personDebt.get(name);
                    personDebt.put(name, currDebt + money);
                } else {
                    personDebt.put(name, money);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // comparator для мапи по велью
//        Comparator<String> comparator = (String o1, String o2) -> {
//                Integer value1 = personDebt.get(o1);
//                Integer value2 = personDebt.get(o2);
//                return value1.compareTo(value2) > 0 ? 1 : -1;
//            };
        Comparator<String> comparator = (o1, o2) -> personDebt.get(o1).compareTo(personDebt.get(o2)) > 0 ? 1 : -1;

        Map<String, Integer> result = new TreeMap<>(comparator.reversed());
        result.putAll(personDebt);

        System.out.println(result);
    }
}
