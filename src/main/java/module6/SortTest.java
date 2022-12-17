package module6;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int [] arr = {11, 3, 14, 16, 7};
        //arr[10] = 17;
        // 3 11 14 16 7
        // 3 11 14 7 16
        // 3 11 7 14 16
        // 3 7 11 14 16
        User user = null;
        user.getLastName();

//        class ComparatorDesc extends Comparator {
//            @Override
//            public boolean compare(int element1, int element2) {
//                return element1 < element2;
//            }
//        }
//        Comparator comparator = new ComparatorDesc();

        Comparator comparator = new Comparator() {
            @Override
            public boolean compare(int element1, int element2) {
                return element1 < element2;
            }
        };
        sort(arr, comparator);
        System.out.println("arr = " + Arrays.toString(arr));

    }

    public static void sort(int [] arr, Comparator comparator){
        boolean isSorted = false;
        int buf;
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

//    public static void sortAsc(int [] arr){
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < arr.length-1; i++) {
//                if(arr[i] > arr[i+1]){
//                    isSorted = false;
//
//                    buf = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = buf;
//                }
//            }
//        }
//    }

//    public static void sortDesc(int [] arr){
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < arr.length-1; i++) {
//                if(arr[i] < arr[i+1]){
//                    isSorted = false;
//
//                    buf = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = buf;
//                }
//            }
//        }
//    }
}
