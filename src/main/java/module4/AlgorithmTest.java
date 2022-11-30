package module4;

import java.util.Arrays;

public class AlgorithmTest {

    public static void main(String[] args) {
        String [] students = {
                "12345 Maryna N",
                "12346 Nicolas A",
                "12347 Maria B",
                "12348 Egor K"
        };

//        String res = findStudentById("12346", students);
//        System.out.println("res = " + res);

//        String newElement = "12349 Anastasiia L";
//        students = expandArrayManually(students, newElement);
//        System.out.println("students = " + Arrays.toString(students));

//        String [] newElements = {"12349 Anastasiia L", "12350 Igor L"};
//        String[] res = Arrays.copyOf(students, students.length + newElements.length);
//        System.out.println("res = " + Arrays.toString(res));
//        System.arraycopy(newElements, 0, res, students.length, newElements.length);
//        System.out.println("res = " + Arrays.toString(res));

//        String [] studentsRaw = {
//                "12345 Maryna N",
//                "",
//                "    ",
//                "12346 Nicolas A",
//                "12347 Maria B",
//                "",
//                "12348 Egor K"
//        };
//        String [] res = clearFromInvalidData(studentsRaw);
//
//        System.out.println("res = " + Arrays.toString(res));

//        int [] numbers = {1, 4, 7, 3, 4, 9, 40, 15};
//        int max = findMax(numbers);
//        System.out.println("max = " + max);
//        int[] res = deleteOneElement(numbers, max);
//        System.out.println("res = " + Arrays.toString(res));

        int [][] keyboard = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0, 0, 0}
        };
//        for (int i = 0; i < keyboard.length; i++) {
//            System.out.println(Arrays.toString(keyboard[i]));
//        }

//        for (int i = 0; i < keyboard.length; i++) {
//            for (int j = 0; j < keyboard[i].length; j++) {
//                System.out.print(" " + keyboard[i][j]);
//            }
//        }

//        int column = 1;
//        for (int i = 0; i < keyboard.length; i++) {
//            System.out.println(keyboard[i][1]);
//        }

//        for (int j = 0; j < keyboard[0].length; j++) {
//            for (int i = 0; i < keyboard.length; i++) {
//                System.out.println(keyboard[i][j]);
//            }
//            System.out.println("==================");
//        }

        int squareSize = 5;

        // "*". repeat(i)
        String str= "";
        for (int i = 0; i < squareSize; i++) {
            str += "*";
        }

        String res = "";

        while (squareSize > 0){
            res += str + "\n";
            squareSize --;
        }

        System.out.println(res);

    }
    // res =
    //500, 200, 100, 50, 20, 10, 5, 2 и 1
    // 1210
    // res = "500"
    // 1210 - 500 = 710
    // 710
    // 500
    // res = "500" + "500"
    // 710 - 500 = 210
    // 210
    // 200
    // res = "500" + "500" + "200"
    // 210 - 200 = 10
    // 10
    // res = "500" + "500" + "200" + "10"
    // 10 - 10 = 0


    public static int [] deleteOneElement(int [] arr, int element){
        int [] res = new int[arr.length - 1];
        int counter = 0;
        for (int curr : arr) {
            if(curr != element){
                res[counter] = curr;
                counter ++;
            }
        }
        return res;
    }


    
    public static int findMax(int [] arr){
        int currMax = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > currMax){
                currMax = arr[i];
            }
        }
        return currMax;
    }
    
    

    // Array.copyOf
    public static String [] clearFromInvalidData(String [] arr){
        int newArrLength = 0;
        for (String s : arr) {
            if(s != null && !s.isBlank()){
                newArrLength++;
            }
        }
        String [] newArray = new String[newArrLength];
        int counter = 0;
        for (String s : arr) {
            if(s != null && !s.isBlank()){
                newArray[counter] = s;
                counter ++;
            }
        }
        return newArray;
    }

    public static String [] expandArrayManually(String [] arr, String newElem){
        String [] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = newElem;
        return newArray;
    }

    // знайти учня по айді
    public static String findStudentById(String id, String [] students){
        for (String student : students) {
            if(student.contains(id)){
                return student;
            }
        }
        return null;
    }
}
