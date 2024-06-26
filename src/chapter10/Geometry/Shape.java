/**
* simples geometric shape program to practice inheritance and polymorphism
* author: Philippe Matias
*/


//-------------------------------------------
public abstract class Shape extends Object
{
    //-------------------------------------------
    protected String id;
    protected String color;

    //-------------------------------------------
    Shape(String id, String color)
    {
        this.id = id;
        this.color = color;
    }

    //-------------------------------------------
    public String getId()    { return this.id; }
    public String getColor() { return this.color; }

    //-------------------------------------------
    public abstract void draw();
}
