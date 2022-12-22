package module7;

import java.util.StringJoiner;

public class StringBuilderTest {

    public static void main(String[] args) {
        CustomStringBuilder stringBuilder = new CustomStringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            //res = res + i;
            stringBuilder.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
        String res = stringBuilder.toString();
        //System.out.println(res);
    }
}
