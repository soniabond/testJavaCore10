package module8.bankApp;

public class Wallet {

    private Card[] myCards = new Card[3];

    public void initCards() {
        Card firstCard = new Card();
        Card secondCard = new Card();
        secondCard.setCardNumber("987654321");
        firstCard.setBankName(BankName.PRIVATBANK);
        secondCard.setBankName(BankName.UKRSIBBBANK);
        myCards[0] = firstCard;
        myCards[1] = secondCard;
    }

    public void addCard(Card card) {
        for (Card myCard : myCards) {
            if(card.equals(myCard)) {
                System.out.println("card already exists");
                return;
            }
        }
        if(myCards[2] == null) {
            myCards[2] = card;
        }
    }

    public void printAllCardsInfo() {
        for (Card myCard : myCards) {
            if(myCard != null) {
                System.out.println(myCard);
                System.out.println(myCard.getClass());
                System.out.println("=======================");
            }
        }
    }

}
