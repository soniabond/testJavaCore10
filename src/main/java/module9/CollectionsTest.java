package module9;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {
        List<String> surnames = new ArrayList<>();
        surnames.add("Petrenko");
        surnames.add("Ivanenko");
        surnames.add("Ivanenko");
        surnames.add("Bondar");

        System.out.println(surnames);
        for(String surname: surnames) {
            System.out.println(surname);
        }

        System.out.println("surnames.contains(\"Petrenko\") = " + surnames.contains("Petrenko"));
        System.out.println("surnames.contains(\"Martuyan\") = " + surnames.contains("Martuyan"));
        System.out.println("surnames.get(2) = " + surnames.get(2));

        //System.out.println("surnames.remove(\"Ivanenko\") = " + surnames.remove("Ivanenko"));
        //System.out.println("surnames.remove(\"Ivanenko\") = " + surnames.remove("Ivanenko"));

        //surnames.removeAll(List.of("Ivanenko", "Bondar"));

        //surnames.remove(1);

        System.out.println("surnames.isEmpty() = " + surnames.isEmpty());

        System.out.println(surnames);

        System.out.println("surnames.indexOf(\"Ivanenko\") = " + surnames.indexOf("Ivanenko"));

        surnames.add(2, "lalalala");
        surnames.clear();
        System.out.println("surnames.isEmpty() = " + surnames.isEmpty());


    }
}
