package my.learn.adaptorium;

public class CreditCardAdapter implements Card{

    private CreditCard creditCard;

    public CreditCardAdapter(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void play() {
        System.out.println("I sorta played a " + creditCard.getCardName()
                + " of " + creditCard.getBankName());
    }
}
