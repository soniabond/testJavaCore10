package module6;

public class StaticInitBlockTest {
    public static void main(String[] args) {
        System.out.println("SystemConstants.OS = " + SystemConstants.OS);
        System.out.println("SystemConstants.OS = " + SystemConstants.OS);

        System.out.println("UrlConstants.PaymentUrl.CREATE_PAYMENT = " + UrlConstants.PaymentUrl.CREATE_PAYMENT);
        new UrlConstants.PaymentUrl();
    }
}
