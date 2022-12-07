package module5;

public class ArrayUtils {
    public static int [] subarray(int [] array, int startIndex, int endIndex) {
        if(endIndex > array.length || startIndex >= endIndex || startIndex < 0) {
            System.out.println("Invalid range");
            return new int [0];
        }
        int [] res = new int[endIndex - startIndex];
        int counter = 0;
        for (int i = startIndex; i < endIndex; i++) {
            res[counter] = array[i];
            counter ++;
        }
        return res;
    }

    public static int [] subarray(int [] array, int startIndex) {
        return subarray(array, startIndex);
    }

//    public static int [] subarray(int [] array, int startIndex) {
//        if(startIndex < 0) {
//            System.out.println("Invalid range");
//            return new int [0];
//        }
//        int [] res = new int[array.length - startIndex];
//        int counter = 0;
//        for (int i = startIndex; i < array.length; i++) {
//            res[counter] = array[i];
//            counter ++;
//        }
//        return res;
//    }
}
