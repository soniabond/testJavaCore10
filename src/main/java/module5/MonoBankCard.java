package module5;

public class MonoBankCard extends Card{

    private int commission = 40;

    @Override
    public String getBankName() {
        return "Monobank";
    }

    @Override
    public long withdrawMoney(long amountToWithdraw) {
        long actualAmount = amountToWithdraw + commission;
        if(amountToWithdraw <= 0) {
            System.out.println("Invalid amount: " + amountToWithdraw);
            return 0;
        }
        if (actualAmount > balance) {
            System.out.println("Not enough money on your balance. Try smaller amount");
            return 0;
        }
        System.out.println("You have withdrawn " + amountToWithdraw);
        System.out.println("Plus commission " + commission);
        balance -= actualAmount;
        return amountToWithdraw;
    }
}
