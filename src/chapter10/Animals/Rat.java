/**
 * Simple test of plymorphism
 * Author: Philippe Matias
 */


 /*-------------------------------------*/
public class Rat extends Animal
{
     /*-------------------------------------*/
    private int jumpHeight;

     /*-------------------------------------*/
    Rat(String name, int jumpHeight) 
    {
        super(name, "white", 20);
        this.jumpHeight = jumpHeight;
    } 

    /*-------------------------------------*/
    @Override
    public void sayHi()
    {
        System.out.printf("** %s says \'Squeak!!!!\'\n", this.name);
    }

    /*-------------------------------------*/
    public void climb()
    {
        System.out.printf("** %s climbs %d cm\n", this.name, this.jumpHeight);
    }
}
