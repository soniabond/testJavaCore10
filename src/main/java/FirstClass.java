import java.util.List;

public class FirstClass {
    // to create git repo -> git init
    // to track files by git -> git add "filename" or git add -u or git add .
    // to make commit -> git commit -m "your message"
    // to see commit history -> git log
    // to go to other commit -> git checkout "commit hash"
    // to create new branch -> git checkout -b "branch name"
    // to switch to exiting branch -> git checkout "branch name"
    public static void main(String[] args) {
        //        byte a = 15;
//        //System.out.println((byte)(-128 + (-1)));
//
//
//        float b = 9.9f;
//        boolean c = false;
//        BigDecimal bigDecimal = new BigDecimal("2.6548426526548943165316498464");
//        //System.out.println(1f / 3f);
//
//        char charA = 'A';
//        System.out.println("charA = " + (int)charA);

//        int initVal = 5;
//        long longVal = initVal;
//
//        long a = 50;
//        int b = (int) a;
//        long c = 150;
//
//        sum((int)a, (int)c);

//        Integer a = null;
//        System.out.println("a = " + a);
//        int val = 1;
//        Integer intObject = val; // inboxing
//        int val1 = intObject; // outboxing
//
//        //instanceOf
//
//        // + - * / %
//        //double i = 2;
//        //int res = 7f / 2;
//        //float res = 7 / 2;
//
//        int res = 7 % 2;
//        System.out.println("res = " + res);
//
//        res = res + 5;
//        res = res * 6;
//
//        res += 5;
//        res *= 6;
//        res /= 7;
//
//        int i = 5;
//        i += 1;
//        i -= 1;
//        // unary operations
//        i++;
//        i--;

//        double a = 5.5;
//        float b = (float) a;
//        FirstClass firstClass = new FirstClass();
//        float result = firstClass.someMethod(a);
//        System.out.println("result = " + result);

        // математичні оператори
        // > < >= <= == !=
//        int a = 5;
//        int b = 6;
//
//        boolean isLower = a < b;
//        System.out.println("isLower = " + isLower);
//        boolean isEquals = a == b;
//        System.out.println("isEquals = " + isEquals);


        // логічні оператори || - or && - and ^ - xor виключне або

        // дати знижку, якщо покупець підписаний на розсилку або має карту постійного покупця
        // дати знижку = підписаний на розсилку || має карту постійного покупця
        // дати знижку = true підписаний на розсилку = true || має карту постійного покупця = true
        // дати знижку = true підписаний на розсилку = true || має карту постійного покупця = false
        // дати знижку = true підписаний на розсилку = false || має карту постійного покупця = true
        // дати знижку = false підписаний на розсилку = false || має карту постійного покупця = false

        // OR - if at least one TRUE -> TRUE


        // видати сертифікат про закінчення курсів, якщо студент був на всх лекціях та здав все дз
        // видати сертифікат = був на всіх лекціях && здав все дз
        // видати сертифікат = true  був на всіх лекціях = true && здав все дз = true
        // видати сертифікат = false був на всіх лекціях = true && здав все дз = false
        // видати сертифікат = false був на всіх лекціях = false && здав все дз = true
        // видати сертифікат = false був на всіх лекціях = false && здав все дз = false

        // at least one FALSE -> FALSE


        // XOR
        // result true = true ^ false
        // result true = false ^ true
        // result false = true ^ true
        // result false = false ^ false


        // ! - оператор заперечення
        // !true = false
        // !false = true

//        boolean passedExam = isAttendedAllLessons() && isPassedAllHW();
//        System.out.println(passedExam);

        int score = 50;
       // boolean passedExam = isPassedAllHW() || (isAttendedAllLessons() && score > 60);
        // (isAttendedAllLessons() && score > 60)
        // isAttendedAllLessons() = false
        // score > 60 = false
        // false && false = falses
        // isPassedAllHW() || false
        // true || false = true
        //System.out.println("passedExam = " + passedExam);

        String str = "xxx";
        String str1 = "x".concat("xx");
        System.out.println(str1.equals(str));

        //Довжина рядка
        //Конкатенація
        //Методи у рядків
        //Верхній та нижній регістри
        //Чи є в рядку інший рядок
        //З'єднання рядків
        //Індекс символу
        //Починається або закінчується рядок іншим рядком
        //Чи порожній рядок
        //Заміна підрядка
        //Чищення рядка від стартових та фінальних пробілів
        //Отримати підрядок
        str = "abc";
        System.out.println("str.length() = " + str.length());
        //Індекс символу
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(str.length() - 1) = " + str.charAt(str.length() - 1));

        String result = String.join(",", "Vasia", "Petia", "Olia");
        String result1 = str.concat("alalalal");
        String result3 = "Vasia" + "Petia" + "Olia" + 1 + 19.5f;
        System.out.println("result3 = " + result3);


    }

    public static boolean isAttendedAllLessons(){
        System.out.println("isAttendedAllLessons worked");
        return false;
    }

    public static boolean isPassedAllHW() {
        System.out.println("isPassedAllHW worked");
        return true;
    }

    public float someMethod(double variable){
        return (float) (variable * 5);
    }
}
