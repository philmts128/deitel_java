/**
* simples geometric shape program to practice inheritance and polymorphism
* author: Philippe Matias
*/


//-------------------------------------------
public abstract class Shape3d extends Shape
{
    //-------------------------------------------
    Shape3d(String id, String color)
    {
        super(id, color);
    }

    //-------------------------------------------
    public abstract double perimeter();
    public abstract double surface();
    public abstract double volume();
}
