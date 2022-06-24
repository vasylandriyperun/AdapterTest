package my.learn.adaptorium;

public class PlayingCard implements Card{
    private String value;
    private Suit suit;

    public PlayingCard(String value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public void play() {
        System.out.println("Played " + value + " of " + suit);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
