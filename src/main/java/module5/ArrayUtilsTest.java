package module5;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] arr = {1, 5, 4, 7, 9, 60, 14, 5};
        int[] subarray = ArrayUtils.subarray(arr, 2);
        System.out.println("subarray = " + Arrays.toString(subarray));

    }
}
