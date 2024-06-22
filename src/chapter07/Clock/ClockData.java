/**
* Simple program to simulate a clock
* Author: myself
*/


public class ClockData
{
    /*-----------------------------------*/
    private int seconds;
    private int minutes;
    private int hours;

    /*-----------------------------------*/
    //Clock() {}

    public ClockData(int h, int m, int s)
    {
        this.seconds = s;
        this.minutes = m;
        this.hours   = h;
    }

    /*-----------------------------------*/
    public void setSeconds(int s) { this.seconds = s; }
    public void setMinutes(int m) { this.minutes = m; }
    public void setHours(int h)   { this.hours   = h; }

    /*-----------------------------------*/
    public int getSeconds() { return this.seconds; }
    public int getMinutes() { return this.minutes; }
    public int getHours()   { return this.hours;   }

    /*-----------------------------------*/
    public void setTotalSeconds(int s)
    {
        this.hours = s / 3600;
        this.minutes = (s % 3600) / 60;
        this.seconds = (s % 3600) % 60;
    }

    public int getTotalSeconds()
    {
        int ts = this.hours  * 3600;
        ts += this.minutes * 60;
        ts += seconds;
        return ts;
    }

    /*-----------------------------------*/
    public void addHours(int h)
    {
        this.hours += h;
        this.hours %= 24;
    }

    public void addMinutes(int m)
    {
        m += this.minutes;
        this.hours += (m / 60);
        this.minutes = m % 60;
    }

    public void addSeconds(int s)
    {
        s += this.seconds;
        this.seconds = s % 60;
        this.addMinutes(s / 60);
    }

    /*-----------------------------------*/
    public void display()
    {
        System.out.printf("%02d:%02d:%02d\n",
            this.hours, this.minutes, this.seconds);
    }
}


