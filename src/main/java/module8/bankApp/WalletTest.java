package module8.bankApp;

import java.util.Arrays;

public class WalletTest {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.initCards();
       // wallet.printAllCardsInfo();
        Card card = new Card();
        card.setBankName(BankName.MONOBANK);
        card.setCardNumber("123654789");
        wallet.addCard(card);
        wallet.printAllCardsInfo();

        System.out.println("BankName.values() = " + Arrays.toString(BankName.values()));
        for (BankName bankName : BankName.values()) {
            System.out.println(bankName.getFullBankName());
            System.out.println(bankName.getId());
        }
    }
}
