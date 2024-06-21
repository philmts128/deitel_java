/**
* Another class example for testing UML
* author: Philippe Matias
*/


public class Kitten
{
    public static void main(String[] args)
    {
        var garfield = new Cat("Garfield", "orange", 5);
        garfield.hi();
    }
}


class Cat
{
    private String name;
    private String color;
    private int age;

    Cat(String n, String c, int a)
    {
        this.name = n;
        this.color = c;
        this.age = a;
    }

    public void hi()
    {
        System.out.printf("| %s of color %s and age %d said meow!\n",
                          this.name, this.color, this.age);
    }
}
