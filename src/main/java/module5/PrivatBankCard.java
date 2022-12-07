package module5;

public class PrivatBankCard extends Card {
    private String address = "Mazepy street Odessa";

    public String getAddress() {
        return address;
    }

    @Override
    public String getBankName() {
        return "PrivatBank";
    }

    @Override
    public long withdrawMoney(long amountToWithdraw) {
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
}
