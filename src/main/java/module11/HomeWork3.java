package module11;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork3 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "A, F, B",
                "D, C");
        List<String> res = list.stream()
                .map(str -> List.of(str.split(", ")))
                // Stream<List<String>> -> Stream<String>
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(res);

    }
}
