/**
* Class representing hracters of a game applying inherintance
* Author: Philippe Matias
*/


public class Knight extends Character
{
    //------------------------------------------
    Knight(String name)
    {
        super(name, 900, 5, 155, 5);
    }

    public void protect(Character ch)
    {
        System.out.printf("** %s protected %s!\n", this.getName(), ch.getName());
    }

    public void rage()
    {
        System.out.printf("** %s enhanced its force!\n", this.getName());
    }

    @Override
    public void attack()
    {
        System.out.printf("** %s caused great damage!\n", this.getName());
    }

    @Override
    public void blackMagic()
    {
        System.out.printf("** %s cannot cast spells.\n", this.getName());
    }

    @Override
    public void whiteMagic()
    {
        System.out.printf("** %s cannot cast spells.\n", this.getName());
    }
}
