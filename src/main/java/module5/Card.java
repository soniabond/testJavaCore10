package module5;

public abstract class Card {
    private String cardNumber = "123456789";
    private String fullName = "Ivan Ivanov";
    protected long balance = 1000;

    private long creditLimit = 0;

    // геттер - метод, який відкриває читання поля. він повертає значення цього поля в зовнішній світ

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public long getBalance() {
        return balance;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    // cеттер - метод, який відкриває доступ на запис в поле
    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

//    public long withdrawMoney(long amountToWithdraw) {
//        if(amountToWithdraw <= 0) {
//            System.out.println("Invalid amount: " + amountToWithdraw);
//            return 0;
//        }
//        if (amountToWithdraw > balance) {
//            System.out.println("Not enough money on your balance. Try smaller amount");
//            return 0;
//        }
//        System.out.println("You have withdrawn " + amountToWithdraw);
//        balance -= amountToWithdraw;
//        return amountToWithdraw;
//    }

    public abstract long withdrawMoney(long amountToWithdraw);

}
