/**
 * Software to randomly shuffle deck cards
 * Author: Philippe
 */

 import java.security.SecureRandom;


public class Deck 
{
    private static final int NUM_CARDS = 52;
    private static final String[] FACES = { "um", "dois", "três", "quatro", "cinco",
                                            "seis", "sete", "oito", "nove", "dez",
                                            "valete", "dama", "rei" };
    private static final String[] SUITS = { "paus", "ouros", "copas", "espadas" };
    private Card[] cards = null;
    
    Deck()
    {
        this.cards = new Card[NUM_CARDS];
        this.shuffle();
    }

    public Card cardAt(int index)
    {
        return this.cards[index];
    }

    public int getNumCards()
    {
        return NUM_CARDS;
    }

    //gambiarra! deveria estar usando hash table!
    public void shuffle()
    {
        var rnd = new SecureRandom();

        for (int i = 0; i < NUM_CARDS; ++i)
        {
            String face, suit;

            while (true)
            {
                face = FACES[rnd.nextInt(FACES.length)];
                suit = SUITS[rnd.nextInt(SUITS.length)];

                if (this.exists(face, suit)) continue;
                else break;
            }

            this.cards[i] = new Card(face, suit);
        }
    }

    private boolean exists(String face, String suit)
    {
        for (int i = 0; i < NUM_CARDS; ++i)
        {
            if (this.cards[i] == null)
                return false;

            String f = this.cards[i].getFace();
            String s = this.cards[i].getSuit();
            if (face.equals(f) && suit.equals(s))
                return true;
        }

        return false;
    }
}
