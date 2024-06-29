/**
* Simples dynamic binding example
* Author: Philippe Matias
*/


public class Polymorphism
{
    public static void main(String[] args)
    {
        Polymorphism.start(new Dog("Farejador"));
        Polymorphism.start(new Cat("Frajola"));
    }

    public static void start(Animal an)
    {
        an.hello();
        if (an instanceof Cat) ((Cat)an).sleep();
    }
}


abstract class Animal
{
    protected String name;
    public Animal(String n) { this.name = n; }
    public abstract void hello();
}


class Dog extends Animal
{
    Dog(String n) { super(n); }
    @Override
    public void hello()
    {
        System.out.printf("%s says whoof!\n", this.name);
    }
}


class Cat extends Animal
{
    Cat(String n) { super(n); }
    @Override
    public void hello()
    {
        System.out.printf("%s says meow!\n", this.name);
    }

    public void sleep()
    {
        System.out.printf("%s falls asleep\n", this.name);
    }
}
