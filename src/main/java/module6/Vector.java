package module6;

public class Vector {
    private int [] coordinates;

    public int hash() {
        int sum = 0;
        for (int coordinate : coordinates) {
            sum += coordinate;
        }
        return sum;
    }
}
