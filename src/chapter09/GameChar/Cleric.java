/**
* Class representing hracters of a game applying inherintance
* Author: Philippe Matias
*/



public class Cleric extends Character
{
    //------------------------------------------
    Cleric(String name)
    {
        super(name, 400, 250, 10, 200);
    }

    public void heal(Character ch)
    {
        System.out.printf("** %s healed %s!\n", this.getName(), ch.getName());
    }

    public void pray()
    {
        System.out.printf("** %s protected the entire party!\n", this.getName());
    }

    @Override
    public void attack()
    {
        System.out.printf("** %s damage is insignificant!\n", this.getName());
    }

    @Override
    public void blackMagic()
    {
        System.out.printf("** %s cannot cast black magic.\n", this.getName());
    }

    @Override
    public void whiteMagic()
    {
        System.out.printf("** %s casted holy on the enemy.\n",this.getName());
    }
}
