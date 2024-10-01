/**
 * @author Shahdous Zaman Khan Prohor
 */
public class Card {
    private int face;
    private int suit;

    private static final String[] SUIT_LETTER = {"c", "d", "s", "h"};
    private static final String[] FACE_LETTER = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return FACE_LETTER[face] + SUIT_LETTER[suit];
    }
}
