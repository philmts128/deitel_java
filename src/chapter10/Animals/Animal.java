/**
 * Simple test of plymorphism
 * Author: Philippe Matias
 */


 /*-------------------------------------*/
public abstract class Animal 
{
     /*-------------------------------------*/
    protected String  name;
    protected String color;
    protected int size;

     /*-------------------------------------*/
    public Animal(String name, String color, int size) 
    {
        this.name = name;
        this.color = color;
        this.size = size;
    } 

     /*-------------------------------------*/
    public String getName() { return this.name; }
    public String getColor() { return this.color; }
    public int    getSize() { return this.size; }

     /*-------------------------------------*/
    public abstract void sayHi();
}
