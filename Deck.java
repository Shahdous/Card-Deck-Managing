/**
 * @author Shahdous Zaman Khan Prohor
 */
import java.util.Random;

public class Deck {
    private Card[] cards;
    private int currentCard;

    public Deck() {
        cards = new Card[52];
        currentCard = 0;
        int cardCount = 0;

        for (int suit = 0; suit <= 3; suit++) {
            for (int face = 0; face <= 12; face++) {
                cards[cardCount] = new Card(face, suit);
                cardCount++;
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = random.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
        currentCard = 0;
    }

    public Card dealCard() {
        if (currentCard < cards.length) {
            return cards[currentCard++];
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cards.length; i++) {
            sb.append(cards[i].toString());
            if ((i + 1) % 13 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
