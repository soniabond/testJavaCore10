package module11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork4 {
    public static void main(String[] args) {
        // x[n + 1] = 1 (a x[n] + c) % m
        // a = 5
        // c = 6
        // m = 7
        Stream<Integer> stream = Stream.iterate(1, x -> (5 * x + 6) % 7 );
        stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
