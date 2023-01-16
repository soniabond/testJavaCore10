package module9;

public abstract class Comparator {
    public abstract <T extends Comparable<T>> boolean compare(T element1, T element2);
}
