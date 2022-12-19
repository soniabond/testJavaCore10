package module7;

import java.util.Arrays;

public class Stopwatch {
    private final Time [] loops;

    public Stopwatch(Time[] loops) {
        this.loops = Arrays.copyOf(loops, loops.length);
    }

    public Time[] getLoops() {
        return Arrays.copyOf(loops, loops.length);
    }

    @Override
    public String toString() {
        return "Stopwatch{" +
                "loops=" + Arrays.toString(loops) +
                '}';
    }
}
