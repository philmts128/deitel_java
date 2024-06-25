/**
* Class representing hracters of a game applying inherintance
* Author: Philippe Matias
*/



public class Character extends Object
{
    //------------------------------------------
    protected String name;
    protected int hp;
    protected int mp;
    protected int force;
    protected int magic;

    //------------------------------------------
    public Character(String name, int hp, int mp, int force, int magic)
    {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.force = force;
        this.magic = magic;
    }

    public void attack() {}
    public void blackMagic() {}
    public void whiteMagic() {}
    public String getName() { return this.name; }
}
