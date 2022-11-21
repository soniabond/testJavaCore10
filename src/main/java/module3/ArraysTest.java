package module3;

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
        String temp = emails[0];
        emails[0] = emails[1];
        System.out.println("emails = " + Arrays.toString(emails));
        emails[1] = temp;
        System.out.println("emails = " + Arrays.toString(emails));


    }

    public void someMethod(String [] arr){
        int length = arr.length;
        arr[arr.length - 1] = "djfsjdfds";
    }
}
