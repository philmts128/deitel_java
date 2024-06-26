/**
* simples geometric shape program to practice inheritance and polymorphism
* author: Philippe Matias
*/


public class Main
{
    public static void main(String[] args)
    {
        var cube = new Cube("cube1", "blue", 10);
        Main.shapeInfo(cube);

        var tri = new Triangle("tri1", "red", 2,3,4);
        Main.shapeInfo(tri);
    }

    public static void shapeInfo(Shape s)
    {
        System.out.print(s);
    }
}
