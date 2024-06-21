/**
 * Software to randomly shuffle deck cards
 * Author: Philippe
 */

public class Card 
{
    private String face;
    private String suit;

    Card() {}

    Card(String face, String suit)
    {
        this.face = face;
        this.suit = suit;
    }

    public void setFace(String f) { this.face = f; }
    public void setSuit(String s) { this.suit = s; }
    public String getFace() { return this.face; }
    public String getSuit() { return this.suit; } 

    public String toString()
    {
        String c = face + " de " + suit;
        return c;
    }
}
