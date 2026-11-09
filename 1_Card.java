public class Card_1 {
    private String face;
    private String suit;

    public Card_1(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}