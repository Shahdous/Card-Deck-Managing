/**
 * @author Shahdous Zaman Khan Prohor
 */
public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // 1. Display the unshuffled deck
        System.out.println("\n*** Unshuffled Deck ***");
        System.out.println(deck);

        // 2. Shuffle the deck and display it again
        deck.shuffle();
        System.out.println("**** Shuffled Deck ****");
        System.out.println(deck);

        // 3. Deal and display the first five cards
        System.out.println("**** Dealing the first five cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.print(deck.dealCard() + " ");
        }
        System.out.println("\n");

        // 4. Loop to deal the rest of the cards, except the last one
        for (int i = 0; i < 46; i++) {
            deck.dealCard();
        }

        // 5. Deal and print the last card
        System.out.println("**** Dealing the last card from the deck ****");
        System.out.println(deck.dealCard());

        // 6. Test one more call to dealCard()
        System.out.println("**** Attempting to deal one more ****");
        if (deck.dealCard() == null) {
            System.out.println("Correct - dealCard() returned null");
        } else {
            System.out.println("Error - Expected null but got a card");
        }

        // 7. Shuffle the deck and display it again
        deck.shuffle();
        System.out.println("**** Re-shuffled Deck ****");
        System.out.println(deck);

        // 8. Deal 5 more cards and display them
        System.out.println("**** Dealing the first five cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.print(deck.dealCard() + " ");
        }
        System.out.println("\n");
    }
}
