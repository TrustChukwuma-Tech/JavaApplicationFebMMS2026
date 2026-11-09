import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards_2 {

    private List<Card> deck;
    private int currentCard;

    private String[] faces = {
        "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"
    };

    private String[] suits = {
        "Hearts", "Diamonds", "Clubs", "Spades"
    };

    public DeckOfCards() {
        deck = new ArrayList<>();

        for (String suit : suits) {
            for (String face : faces) {
                deck.add(new Card(face, suit));
            }
        }

        currentCard = 0;
    }

    public void shuffle() {
        Collections.shuffle(deck);
        currentCard = 0;
    }

    public Card dealCard() {
        if (currentCard < deck.size()) {
            return deck.get(currentCard++);
        }
        return null;
    }

    public boolean containsPair(Card[] hand) {
        int[] count = getCounts(hand);

        for (int value : count) {
            if (value == 2) return true;
        }
        return false;
    }

    public boolean containsTwoPairs(Card[] hand) {
        int pairs = 0;
        int[] count = getCounts(hand);

        for (int value : count) {
            if (value == 2) pairs++;
        }
        return pairs == 2;
    }

    public boolean containsThreeOfAKind(Card[] hand) {
        for (int value : getCounts(hand)) {
            if (value == 3) return true;
        }
        return false;
    }

    public boolean containsFourOfAKind(Card[] hand) {
        for (int value : getCounts(hand)) {
            if (value == 4) return true;
        }
        return false;
    }

    public boolean containsFlush(Card[] hand) {
        for (int i = 1; i < hand.length; i++) {
            if (!hand[i].getSuit().equals(hand[0].getSuit())) {
                return false;
            }
        }
        return true;
    }

    public boolean containsStraight(Card[] hand) {
        int[] values = new int[5];

        for (int i = 0; i < 5; i++) {
            values[i] = getFaceValue(hand[i].getFace());
        }

        java.util.Arrays.sort(values);

        for (int i = 1; i < 5; i++) {
            if (values[i] != values[i - 1] + 1) {
                return false;
            }
        }
        return true;
    }

    public boolean containsFullHouse(Card[] hand) {
        int[] count = getCounts(hand);
        boolean three = false;
        boolean two = false;

        for (int value : count) {
            if (value == 3) three = true;
            if (value == 2) two = true;
        }

        return three && two;
    }

    private int[] getCounts(Card[] hand) {
        int[] count = new int[13];

        for (Card card : hand) {
            count[getFaceValue(card.getFace())]++;
        }

        return count;
    }

    private int getFaceValue(String face) {
        if (face.equals("Ace")) return 0;
        if (face.equals("Jack")) return 10;
        if (face.equals("Queen")) return 11;
        if (face.equals("King")) return 12;

        return Integer.parseInt(face) - 1;
    }
}
