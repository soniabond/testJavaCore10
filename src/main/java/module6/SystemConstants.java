package module6;

public class SystemConstants {

    static {
        OS = System.getProperty("os.name");
        System.out.println("static block");
    }
    public static final String OS;
}
