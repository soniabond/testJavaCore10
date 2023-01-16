package module9;

import module6.User;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        //Integer [] arr = {11, 3, 14, 16, 7};
        String [] arr = {"A", "C", "B", "1"};

        Comparator comparator = new Comparator() {

            @Override
            public <T extends Comparable<T>> boolean compare(T element1, T element2) {
                return element1.compareTo(element2) > 0;
            }
        };
        sort(arr, comparator);
        System.out.println("arr = " + Arrays.toString(arr));

    }

    public static <T extends Comparable<T>> void sort(T [] arr, Comparator comparator){
        boolean isSorted = false;
        T buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(comparator.compare(arr[i], arr[i+1])){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
    }
}
