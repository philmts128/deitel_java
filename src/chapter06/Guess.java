/**
* Guess a number in a given range.
* Author: Philippe
*/


import java.util.Scanner;
import java.security.SecureRandom;


public class Guess
{
    public static void main(String[] args)
    {
        var in = new Scanner(System.in);
        var rnd = new SecureRandom();
        int up, low;

        //input
        while (true)
        {
            System.out.print("** enter the lower bound: ");
            low = in.nextInt();

            System.out.print("** enter the upper bound: ");
            up = in.nextInt();

            boolean inv = (low >= up) || (low <= 0) || (up <= 0);
            if (inv) {
                System.out.print("** invlid input");
                continue;
            }

            break;
        }

        //output
        int num = rnd.nextInt(up-low+1) - low;
        while (true)
        {

        }
    }

    private void input()
    {

    }
}