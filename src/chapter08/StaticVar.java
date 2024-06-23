/**
* Static variable test
* Author: Phil
*/


public class StaticVar
{
    public static void main(String[] args)
    {
        var c1 = new Count();
        c1.count();

        var c2 = new Count();
        c2.count();
    }
}


class Count
{
    private static int counter = 0;

    public void count()
    {
        System.out.println(Count.counter);
        Count.counter += 1;
    }
}
