package my.learn.adaptorium;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Card> deckOfCards = new ArrayList<>();
        deckOfCards.add(new PlayingCard("King", Suit.HEARTS));
        deckOfCards.add(new PlayingCard("5", Suit.HEARTS));
        deckOfCards.add(new PlayingCard("8", Suit.CLUBS));
        deckOfCards.add(new PlayingCard("Queen", Suit.SPADES));
        CreditCard myLostCard = new CreditCard("Privat",
                "Vasya Pupkin", BigDecimal.ZERO);
        deckOfCards.add(new CreditCardAdapter(myLostCard));
        for (Card card: deckOfCards){
            card.play();
        }
    }
}
