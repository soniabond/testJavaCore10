package module5;

public class BankomatTest {
    //public static void main(String[] args) {
//        Card testCard = new Card();
//
//        System.out.println("testCard.cardNumber = " + testCard.getCardNumber());
//        System.out.println("testCard.fullName = " + testCard.getFullName());
//        System.out.println("testCard.balance = " + testCard.getBalance());
//        System.out.println("testCard.getCreditLimit() = " + testCard.getCreditLimit());
//
////        long balance = testCard.getBalance();
////        balance -=  1500;
//        System.out.println("testCard.balance = " + testCard.getBalance());
//        testCard.setCreditLimit(600);
//        System.out.println("testCard.getCreditLimit() = " + testCard.getCreditLimit());
//
//        testCard.withdrawMoney(1500);
//        System.out.println("testCard.balance = " + testCard.getBalance());
//        testCard.withdrawMoney(400);
//        System.out.println("testCard.balance = " + testCard.getBalance());
//
//        PrivatBankCard privatBankCard = new PrivatBankCard();
//        System.out.println("privatBankCard.getBalance() = " + privatBankCard.getBalance());
//        System.out.println("privatBankCard.getCreditLimit() = " + privatBankCard.getCreditLimit());
//
//        System.out.println("privatBankCard.getAddress() = " + privatBankCard.getAddress());
//        testCard.cardNumber = "3461985835";
//        System.out.println("testCard.cardNumber = " + testCard.cardNumber);

//        System.out.println("==============================================");
//        Card otherCard = new Card();
//        System.out.println("otherCard.cardNumber = " + otherCard.cardNumber);
//        System.out.println("otherCard.fullName = " + otherCard.fullName);
//        System.out.println("otherCard.balance = " + otherCard.balance);
//
//        otherCard.balance += 500;
//        System.out.println("otherCard.balance = " + otherCard.balance);

    //}

    public static void main(String[] args) {
        Card testCard = new MonoBankCard();

        testCard.withdrawMoney(15);
        System.out.println("testCard.balance = " + testCard.getBalance());

        System.out.println("testCard.cardNumber = " + testCard.getCardNumber());
        System.out.println("testCard.fullName = " + testCard.getFullName());
        System.out.println("testCard.balance = " + testCard.getBalance());
        System.out.println("testCard.getCreditLimit() = " + testCard.getCreditLimit());

        PrivatBankATM atm = new PrivatBankATM();
        atm.withdrawMoney(testCard, 500);
        System.out.println("testCard.balance = " + testCard.getBalance());
    }
}
