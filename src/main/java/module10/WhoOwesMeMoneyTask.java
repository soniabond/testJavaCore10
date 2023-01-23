package module10;

import java.io.File;
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
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        Map<String, Integer> result = new TreeMap<>(comparator);
        result.putAll(personDebt);

        System.out.println(result);
    }
}
