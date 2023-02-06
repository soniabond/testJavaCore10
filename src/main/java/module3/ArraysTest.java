package module3;

import module5.ArrayUtilsTest;
import module5.Card;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        String [] emails = new String[3];
        emails[0] = "ivan@gmail.com";
        emails[1] = "vasyl@gmail.com";
        emails[2] = "anna@gmail.com";

        System.out.println("emails = " + Arrays.toString(emails));

//        emails[1] = "new@gmail.com";
//        System.out.println("emails = " + Arrays.toString(emails));


//        int [] intArray = new int[10];
//        System.out.println("intArray = " + Arrays.toString(intArray));

//        String[] copyOfEmails = Arrays.copyOf(emails, emails.length);
//        copyOfEmails[2] = null;
//
//        System.out.println("emails = " + Arrays.toString(emails));
//        System.out.println("copyOfEmails = " + Arrays.toString(copyOfEmails));

//        String[] copyOfEmails = Arrays.copyOfRange(emails, 1, emails.length-1);
//
//        System.out.println("emails = " + Arrays.toString(emails));
//        System.out.println("copyOfEmails = " + Arrays.toString(copyOfEmails));

        // скопіювати тільки елементи з парними індексами в новий масив
//        String[] copyOfEmails = new String[2];
//        copyOfEmails[0] = emails[0];
//        copyOfEmails[1] = emails[2];
//
//        System.out.println("emails = " + Arrays.toString(emails));
//        System.out.println("copyOfEmails = " + Arrays.toString(copyOfEmails));

        // поміняти місцями 2 елементи масиву
//        String temp = emails[0];
//        emails[0] = emails[1];
//        System.out.println("emails = " + Arrays.toString(emails));
//        emails[1] = temp;
//        System.out.println("emails = " + Arrays.toString(emails));

//        String [] cardTypes = {"Black", "White", "Platinum"};
//        System.out.println("cardTypes.length = " + cardTypes.length);
//        System.out.println("cardTypes[2] = " + cardTypes[2]);
//        cardTypes[1] = "NEW";
//        System.out.println("Arrays.toString(cardTypes) = " + Arrays.toString(cardTypes));

        int [][] keyboard = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0, 0, 0}
        };
        System.out.println("keyboard.length = " + keyboard.length);
        System.out.println("keyboard[0].length = " + keyboard[0].length);
        System.out.println("keyboard1 = " + Arrays.toString(keyboard[0])); // звернись до нульвого рядка {1, 2, 3}
        System.out.println("keyboard1 = " + Arrays.toString(keyboard[1]));
        System.out.println("keyboard1 = " + Arrays.toString(keyboard[2]));


    }


    public void someMethod(String [] arr){
        int length = arr.length;
        arr[arr.length - 1] = "djfsjdfds";
    }
}
