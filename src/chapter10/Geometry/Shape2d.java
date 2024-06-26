/**
* simples geometric shape program to practice inheritance and polymorphism
* author: Philippe Matias
*/


//-------------------------------------------
public abstract class Shape2d extends Shape
{
    //-------------------------------------------
    Shape2d(String id, String color)
    {
        super(id, color);
    }

    //-------------------------------------------
    public abstract double perimeter();
    public abstract double area();
}
