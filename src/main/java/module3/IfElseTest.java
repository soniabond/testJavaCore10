package module3;

public class IfElseTest {
    public static void main(String[] args) {
        int age = 18;
        if(age >= 16 && age < 18) {
            System.out.println("Кіно +16 буде");
        } else if (age >= 18) {
            System.out.println("Кіно +18 буде");
        } else {
            System.out.println("Кіна не буде");
        }

        System.out.println("end of program");
    }
}
