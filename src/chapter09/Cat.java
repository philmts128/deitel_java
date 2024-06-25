/**
* simples programa para testar herança
* autor: Felipe
*/


public class Cat
{
    public static void main(String[] args)
    {
        var grf = new HouseCat("Garfield", "orange", 5);
        System.out.println(grf);

        var mph = new HouseCat("Mephisto", "black", 6);
        System.out.println(mph);
    }
}


class HouseCat extends Object
{
    private String name;
    private String color;
    private int age;

    public HouseCat(String n, String c, int a)
    {
        this.name = n;
        this.color = c;
        this.age = a;
    }

    @Override
    public String toString()
    {
        var msg = String.format("meow! I'm the %s cat called %s and I'm %d years old!",
            this.color, this.name, this.age);
        return msg;
    }
}
