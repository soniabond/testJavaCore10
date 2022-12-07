package module5;

public class WalletTest {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.initCards();
        wallet.printAllCardsInfo();
        //wallet.printAllMonobankCardsInfo();
        System.out.println("______________________________________________________");
        Card card = new MonoBankCard();
        wallet.addCard(card);
        wallet.printAllCardsInfo();
        System.out.println("______________________________________________________");
        card.setCardNumber("852963741");
        wallet.addCard(card);
        wallet.printAllCardsInfo();
    }
}
