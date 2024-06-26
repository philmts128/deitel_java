/**
* simples geometric shape program to practice inheritance and polymorphism
* author: Philippe Matias
*/


//-------------------------------------------
public class Cube extends Shape3d
{
    //-------------------------------------------
    private double side;

    //-------------------------------------------
    Cube(String id, double side)
    {
        super(id, "white");
        this.side = side;
    }

    //-------------------------------------------
    Cube(String id, String color, double side)
    {
        super(id, color);
        this.side = side;
    }

    //-------------------------------------------
    @Override
    public double surface()
    {
        double sfc = 6.0 * (this.side * this.side);
        return sfc;
    }

    //-------------------------------------------
    @Override
    public double volume()
    {
        double vm = (this.side * this.side * this.side);
        return vm;
    }

    //-------------------------------------------
    @Override
    public double perimeter()
    {
        double p = 12.0 * this.side;
        return p;
    }

    //-------------------------------------------
    @Override
    public String toString()
    {
        String dt = "\n*----------------------------------*\n";
        dt += String.format("| id: %s\n",          this.id);
        dt += String.format("| color: %s\n",       this.color);
        dt += String.format("| side: %.2f\n",      this.side);
        dt += String.format("| perimeter: %.2f\n", this.perimeter());
        dt += String.format("| volume: %.2f\n",    this.volume());
        dt += String.format("| surface: %.2f\n",   this.surface());
        return dt;
    }

    //-------------------------------------------
    @Override
    public void draw()
    {
        //TODO
    }
}
