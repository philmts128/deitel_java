/**
* simples programa para testar herança
* autor: Felipe
*/


public class Geometry
{
    public static void main(String[] args)
    {
        var tr = new Triangle(1,1, Math.sqrt(2));
        System.out.println(tr);
    }
}


class Shape extends Object
{
    Shape() {}

    public double perimeter() { return 0.0; };
    public double area() { return 0.0; };
}


class Triangle extends Shape
{
    private double side1;
    private double side2;
    private double side3;

    Triangle(double s1, double s2, double s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    @Override
    public double perimeter()
    {
        double p = this.side1;
        p += this.side2;
        p += this.side3;
        return p;
    }

    @Override
    public double area()
    {
        double sp = this.perimeter() / 2.0;
        double a = sp * (sp - this.side1);
        a *= (sp - this.side2);
        a *= (sp - this.side3);
        return Math.sqrt(a);
    }

    @Override
    public String toString()
    {
        String out = String.format("| sides: %.2f, %.2f and %.2f\n",
            this.side1, this.side2, this.side3);
        out += String.format("| perimeter: %.2f\n", this.perimeter());
        out += String.format("| area: %.2f\n", this.area());

        return out;
    }
}
