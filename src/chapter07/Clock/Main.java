/**
* Simple program to simulate a clock
* Author: myself
*/


public class Main
{
    public static void main(String[] args)
    {
        ClockData clock = new ClockData(8, 40, 32);
        clock.display();

        clock.addHours(16);
        clock.display();

        clock.addMinutes(20);
        clock.display();
    }
}

