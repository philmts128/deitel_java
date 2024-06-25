/**
* Class representing hracters of a game applying inherintance
* Author: Philippe Matias
*/


public class Main
{
    public static void main(String[] args)
    {
        var kngHarold = new Knight("Harold");
        kngHarold.attack();
        kngHarold.blackMagic();

        var clcAerie = new Cleric("Aerie");
        clcAerie.heal(kngHarold);
        clcAerie.attack();

        kngHarold.protect(clcAerie);
        kngHarold.rage();
    }
}

