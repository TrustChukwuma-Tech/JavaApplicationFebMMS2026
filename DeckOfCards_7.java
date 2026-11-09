import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards_7 {
    private final List<Card> deck = new ArrayList<>();
    private int currentCard;
    private final Random random = new Random();

    public DeckOfCards() {
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();

        for (Suit suit : suits) {
            for (Face face : faces) {
                deck.add(new Card(face, suit));
            }
        }
    }

    public void shuffle() {
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Collections.swap(deck, i, j);
        }
        currentCard = 0;
    }

    public Card dealCard() {
        if (currentCard < deck.size()) return deck.get(currentCard++);
        return null;
    }
}