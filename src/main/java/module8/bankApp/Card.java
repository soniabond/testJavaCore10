package module8.bankApp;

import java.util.Objects;

public class Card {
    private String cardNumber = "123456789";
    private String fullName = "Ivan Ivanov";
    private long balance = 1000;

    private long creditLimit = 0;

    private BankName bankName;

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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBankName(BankName bankName) {
        this.bankName = bankName;
    }

    public long pay(long amountToWithdraw) {
        if(amountToWithdraw <= 0) {
            System.out.println("Invalid amount: " + amountToWithdraw);
            return 0;
        }
        if (amountToWithdraw > balance) {
            System.out.println("Not enough money on your balance. Try smaller amount");
            return 0;
        }
        System.out.println("You have withdrawn " + amountToWithdraw);
        balance -= amountToWithdraw;
        return amountToWithdraw;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", bank = " + bankName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardNumber, card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber);
    }
}
