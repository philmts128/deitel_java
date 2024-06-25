/**
* simples programa para testar herança
* autor: Felipe
*/


public class Superclass
{
    public static void main(String[] args)
    {
        new Child();
    }
}


class Parent extends Object
{
    /*public Parent()
    {
        System.out.println("| parent clss has been created");
    }*/

    public Parent(int x)
    {
        System.out.printf("| parent %d\n", x);
    }
}


class Child extends Parent
{
    public Child()
    {
        super(999);
        System.out.println("| child clss has been created");
    }

    @Override
    public String toString()
    {
        return "ordinary day";
    }
}
