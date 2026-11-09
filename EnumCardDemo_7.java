public class EnumCardDemo_7 {
    public static void main(String[] args) {
        DeckOfCards_7 deck = new DeckOfCards_7();
        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            System.out.println(deck.dealCard());
        }
    }
}
