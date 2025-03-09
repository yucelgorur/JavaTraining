package memorygame;

public class Card {
    private char cardValue;
    private boolean estimate = false;

    public Card(char cardValue) {
        this.cardValue = cardValue;
    }


    public char getCardValue() {
        return cardValue;
    }

    public void setCardValue(char cardValue) {
        this.cardValue = cardValue;
    }

    public boolean isEstimate() {
        return estimate;
    }

    public void setEstimate(boolean estimate) {
        this.estimate = estimate;
    }
}
