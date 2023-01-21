package module8.bankApp;

import java.util.HashSet;
import java.util.Set;

public class Wallet {

    private Set<Card> myCards = new HashSet<>();

    public void initCards() {
        Card firstCard = new Card();
        Card secondCard = new Card();
        secondCard.setCardNumber("987654321");
        firstCard.setBankName(BankName.PRIVATBANK);
        secondCard.setBankName(BankName.UKRSIBBBANK);
        myCards.add(firstCard);
        myCards.add(secondCard);
    }

    public void addCard(Card card) {
        if(myCards.contains(card)) {
            System.out.println("card already exists");
        } else {
            myCards.add(card);
        }
    }

    public void printAllCardsInfo() {
        System.out.println(myCards);
    }

}
