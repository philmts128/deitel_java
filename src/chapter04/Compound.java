/**
* Chpter 4
* Author: Philippe
*/

import java.util.Scanner;


public class Compound
{
    public static void main(String[] args)
    {
        var scan = new Scanner(System.in);

        System.out.print("| enter the principal: ");
        double p = scan.nextDouble();

        System.out.print("| enter the rate[in %]: ");
        double r = scan.nextDouble()/100.0;

        System.out.print("| enter the time[monsths]: ");
        int t = scan.nextInt();

        System.out.println("\n| Month\t\tFuture\t\tInterest");
        for (int i = 1; i <= t; ++i) {
            var fut = Compound.interest(p, r, i);
            System.out.printf("| %d\t\t$ %.2f\t$ %.2f\n", i, fut, (fut-p));
        }
    }

    public static double interest(double p, double r, int t)
    {
        return p * Math.pow(1.0 + r, t);
    }
}
