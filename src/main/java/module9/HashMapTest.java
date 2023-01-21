package module9;

import module8.bankApp.BankName;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> workerSalary = new HashMap<>();
        workerSalary.put("Ivanov", 18000);
        workerSalary.put("Romanenko", 14000);
        workerSalary.put("Babenko", 10000);
        System.out.println(workerSalary);
        workerSalary.put("Ivanov", 30000);
        System.out.println(workerSalary);
//        Map<String, List<Integer>> map = new HashMap<>();
//        map.put("Alina", new ArrayList<>());
//        map.get("Alina").add(15);
//        map.get("Alina").add(150);
//        System.out.println(map);

        System.out.println("workerSalary.get(\"Ivanov\") = " + workerSalary.get("Ivanov"));
        System.out.println("workerSalary.get(\"Ivanova\") = " + workerSalary.get("Ivanova"));

        System.out.println("workerSalary.containsKey(\"Babenko\") = " + workerSalary.containsKey("Babenko"));
        System.out.println("workerSalary.containsKey(\"AAAA\") = " + workerSalary.containsKey("AAAA"));

//        System.out.println("workerSalary.remove(\"Babenko\") = " + workerSalary.remove("Babenko"));
//        System.out.println("workerSalary.remove(\"Babenko\") = " + workerSalary.remove("Babenko"));

        System.out.println("workerSalary.remove(\"Babenko\", 10000) = " + workerSalary.remove("Babenko", 11000));

        System.out.println("workerSalary.keySet() = " + workerSalary.keySet());
        for (String key: workerSalary.keySet()){
            System.out.print("key = " + key);
            System.out.println(" value = " + workerSalary.get(key));
        }
        
        // calculate average salary of workers
        int sum = 0;
        for (String key: workerSalary.keySet()){
           sum += workerSalary.get(key);
        }
        float avg = (float) sum / workerSalary.size();
        System.out.println("avg = " + avg);

        EnumMap<BankName, Integer> bankNameInteger = new EnumMap<>(BankName.class);
        bankNameInteger.put(BankName.MONOBANK, 15);
        bankNameInteger.put(BankName.PRIVATBANK, 16);
        System.out.println("bankNameInteger = " + bankNameInteger);
    }
}
