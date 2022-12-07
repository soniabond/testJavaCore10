package module5;

public class Wallet {

    private Card [] myCards = new Card[3];

    public void initCards() {
        Card firstCard = new MonoBankCard();
        Card secondCard = new PrivatBankCard();
        secondCard.setCardNumber("987654321");
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

    public void printAllMonobankCardsInfo() {
        for (Card myCard : myCards) {
            //  oб'єкт instanceof якого класу?
            if(myCard instanceof MonoBankCard) {
                System.out.println(myCard);
                System.out.println("=======================");
            }
        }
    }

}
