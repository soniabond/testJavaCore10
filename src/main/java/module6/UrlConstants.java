package module6;

public class UrlConstants {

    public static class PaymentUrl {
        public static final String CREATE_PAYMENT = "/payment/create";
        public static final String GET_ALL_PAYMENTS = "/payments";
    }

    public static class UserConstants {
        public static final String CREATE_USER = "/user/create";
        public static final String DELETE_USER = "/user/delete";
        public static final String GET_USER_BY_ID = "/user/{id}";
    }
}
