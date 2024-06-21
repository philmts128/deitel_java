/**
 * Software to randomly shuffle deck cards
 * Author: Philippe
 */

 public class Main
 {
    public static void main(String[] args)
    {
        var deck = new Deck();

        for (int i = 0; i < deck.getNumCards(); ++i)
            System.out.println(deck.cardAt(i));
    }
 }