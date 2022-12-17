package module6;

import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter password");
            String password = scanner.nextLine();

            try {
                passwordValidator(password);
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
                System.out.println("try again!");
            } finally {
                System.out.println("I am finally block");
            }

        }
    }

    public static void passwordValidator(String password) throws ValidationException{
        if(password == null || password.isBlank()){
            throw new ValidationException("empty password");
        } else if (password.length() < 8) {
            throw new ValidationException("password length is less then 8");
        }
    }
}
