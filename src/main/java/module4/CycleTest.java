package module4;

import java.util.Arrays;
import java.util.Scanner;

public class CycleTest {
    public static void main(String[] args) {
        // 1 - лічильник
        // 2- умова припинення циклу
//        for(int i = 0; i < 5; i++){
//            System.out.println("i = " + i);
//        }

//        for(int i = 10; i > 0; i--) {
//            System.out.println("i = " + i);
//        }

//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println("i = " + i);
//        }

        // endless loop
//        for (; ;) {
//            System.out.println("i = ");
//        }

//        int i = 0;
//        for (; i < 5; i++) {
//            System.out.println("i = " + i);
//        }
//        for (; i < 10; ) {
//            i++;
//            System.out.println("i = " + i);
//        }

//        String [] emails = {"ivan@gmail.com",
//        "vasyl@gmail.com",
//        "anna@gmail.com",
//        "petia@gmail.com",
//        "maryna@gmail.com"};

//        for (int i = 0; i < emails.length; i++) {
//            System.out.println(i + " " + emails[i]);
//        }

//        for (int i = 1; i < emails.length; i += 2) {
//            System.out.println(i + " " + emails[i]);
//        }

        // ви сервіс у вас э користувачі яким переодично треба оновлювати паролі.
        // вхідні дані - мейл і через кому кількість днів через які треба змінити пароль
        // зробити розсилку тим, у кого пароль треба змінити не більш ніж через 14 днів
//        String [] emails = {"ivan@gmail.com,14",
//                "vasyl@gmail.com,50",
//                "anna@gmail.com,6",
//                "petia@gmail.com,8",
//                "maryna@gmail.com,60"};
//
//        for (int i = 0; i < emails.length; i++) {
//            String email = emails[i];
//            String[] strings = email.split(",");
//            int expDay = Integer.parseInt(strings[1]);
//            if(expDay <= 14) {
//                sendMail(strings[0], strings[1]);
//            }
//        }

        // задача заміти символа
        // solve via 2 dim
        // access to column in 2 dim
        // sout alphabet



//        String [] emails = {"ivan@gmail.com",
//        "vasyl@gmail.com",
//        "anna@gmail.com",
//        "petia@gmail.com",
//        "maryna@gmail.com"};
//
//        for(String email: emails){
//            System.out.println("email = " + email);
//        }



        //login();
        streetFinder();


        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }


    // задача пошуку моєї вулиці в графіку відключення
    public static void streetFinder(){

        String myStreet = "street7";
        String [] streets = new String[40];

        for (int i = 0; i < streets.length; i++) {
            streets[i] = "street" + i;
        }

        // задача пошуку моєї вулиці в графіку відключення
        for (String street : streets) {
            System.out.println("street = " + street);
            if(myStreet.equals(street)) {
                System.out.println("You are in graph :((((((((");
                break;
            }
        }
        System.out.println("END OF PROGRAM");

    }

    // вводжу пароль. якщо підійшов - вивести успіх і припинити спрови вводу,
    // якщо не підійшов - пробувати ввести знову. кількість спроб необмещена
    public static void login() {
        String correctPassword = "12345";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        String currentPassword = scanner.nextLine();

        while(!correctPassword.equals(currentPassword)) {
            System.out.println("Try again:");
            currentPassword = scanner.nextLine();
        }

    }

    public static void sendMail(String mail, String expDay) {
        System.out.println("to:" + mail);
        System.out.println("Your password expires in " + expDay + " days. Renew please.");
        System.out.println("_____________________________________________________________");
    }
}
