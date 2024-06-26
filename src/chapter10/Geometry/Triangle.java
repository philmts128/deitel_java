/**
* simples geometric shape program to practice inheritance and polymorphism
* author: Philippe Matias
*/


//-------------------------------------------
public class Triangle extends Shape2d
{
    //-------------------------------------------
    private double side1;
    private double side2;
    private double side3;

    //-------------------------------------------
    Triangle(String id, double s1, double s2, double s3)
    {
        super(id, "white");
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    //-------------------------------------------
    Triangle(String id, String color, double s1, double s2, double s3)
    {
        super(id, color);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    //-------------------------------------------
    public boolean isEquilateral()
    {
        boolean e = (this.side1 == this.side2) &&
                    (this.side1 == this.side3) &&
                    (this.side2 == this.side3);
        return e;
    }

    //-------------------------------------------
    public boolean isScalene()
    {
        boolean e = (this.side1 != this.side2) &&
                    (this.side1 != this.side3) &&
                    (this.side2 != this.side3);
        return e;
    }

    //-------------------------------------------
    public boolean isIsosceles()
    {
        boolean e = ((this.side1 == this.side2) && (this.side1 != this.side3)) ||
                    ((this.side1 == this.side3) && (this.side1 != this.side2)) ||
                    ((this.side2 == this.side3) && (this.side2 != this.side1));
        return e;
    }

    //-------------------------------------------
    public boolean isRight()
    {
        double hip = this.side1;
        double c1 =  this.side2;
        double c2 =  this.side3;
        if (c1 >= hip) { hip = c1; c1 = hip; }
        if (c2 >= hip) { hip = c2; c2 = hip; }

        boolean e = (Math.pow(hip, 2.0) == Math.pow(c1, 2.0) + Math.pow(c2, 2.0));
        return e;
    }

    //-------------------------------------------
    @Override
    public double perimeter()
    {
        double p = this.side1 + this.side2 + this.side3;
        return p;
    }

    //-------------------------------------------
    @Override
    public double area()
    {
        double sp = this.perimeter()/2.0;
        sp *= (sp - side1);
        sp *= (sp - side2);
        sp *= (sp - side3);
        return Math.sqrt(sp);
    }

    //-------------------------------------------
    @Override
    public String toString()
    {
        String dt = "\n*----------------------------------*\n";
        dt += String.format("| id: %s\n",          this.id);
        dt += String.format("| color: %s\n",       this.color);
        dt += String.format("| side1: %.2f\n",     this.side1);
        dt += String.format("| side2: %.2f\n",     this.side2);
        dt += String.format("| side3: %.2f\n",     this.side3);
        dt += String.format("| perimeter: %.2f\n", this.perimeter());
        dt += String.format("| area: %.2f\n",      this.area());
        return dt;
    }

    //-------------------------------------------
    @Override
    public void draw()
    {
        //TODO
    }
}
