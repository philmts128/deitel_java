/*
 * simple class example
 * author: Philippe Matias 
 */


 /*-------------------------------------------*/
 public class PersonEx
 {
    /*-------------------------------------------*/
    public static void main(String[] args)
    {
        var me = new Person("Philippe", 32);
        System.out.printf("** name: %s\n", me.getName());
        System.out.printf("** age: %d\n", me.getAge());
    }
 }


/*-------------------------------------------*/
class Person
{
    private String name;
    private int age;

    /*-------------------------------------------*/
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /*-------------------------------------------*/
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
}