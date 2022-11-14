import java.math.BigDecimal;

public class FirstClass {
    // to create git repo -> git init
    // to track files by git -> git add "filename" or git add -u or git add .
    // to make commit -> git commit -m "your message"
    // to see commit history -> git log
    // to go to other commit -> git checkout "commit hash"
    // to create new branch -> get checkout -b "branch name"
    // to switch to exiting branch -> get checkout "branch name"
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

        Integer a = null;
        System.out.println("a = " + a);
        int val = 1;
        Integer intObject = val; // inboxing
        int val1 = intObject; // outboxing
        
        //instanceOf
        
        // + - * / %
       //double i = 2;
        //int res = 7f / 2;
        //float res = 7 / 2;

        int res = 7 % 2;
        System.out.println("res = " + res);

        res = res + 5;
        res = res * 6;

        res += 5;
        res *= 6;
        res /= 7;

        int i = 5;
        i += 1;
        i -= 1;
        // unary operations
        i++;
        i--;
    }

    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("result = " + result);
    }
}
