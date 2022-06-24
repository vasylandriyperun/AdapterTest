package my.learn.adaptorium;

import java.math.BigDecimal;

public class CreditCard {
    private String bankName;
    private String cardName;
    private BigDecimal balance;

    public CreditCard(String bankName, String cardName, BigDecimal balance) {
        this.bankName = bankName;
        this.cardName = cardName;
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
