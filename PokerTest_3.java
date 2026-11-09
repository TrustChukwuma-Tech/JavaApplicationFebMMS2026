public class PokerTest_3 {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        Card[] hand = new Card[5];

        System.out.println("Your Five Poker Cards:");

        for (int i = 0; i < 5; i++) {
            hand[i] = deck.dealCard();
            System.out.println(hand[i]);
        }

        System.out.println("\nPoker Results:");

        System.out.println("Pair: " + deck.containsPair(hand));
        System.out.println("Two Pairs: " + deck.containsTwoPairs(hand));
        System.out.println("Three of a Kind: " + deck.containsThreeOfAKind(hand));
        System.out.println("Four of a Kind: " + deck.containsFourOfAKind(hand));
        System.out.println("Flush: " + deck.containsFlush(hand));
        System.out.println("Straight: " + deck.containsStraight(hand));
        System.out.println("Full House: " + deck.containsFullHouse(hand));
    }
}
