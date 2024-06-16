
import java.util.Scanner;
import java.util.ArrayList;


public class Chart
{
    /*---------------------------------------------*/
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        var nums = new ArrayList<Integer>();

        System.out.print("| enter a sequence of integers[Ctrl+Z to stop]: ");

        while (sc.hasNext()) {
            int n = sc.nextInt();
            nums.add(n);
        }

        for (int i : nums)
            Chart.printChart(i);
    }

    /*---------------------------------------------*/
    public static void printChart(int n)
    {
        System.out.printf("%03d - ", n);
        for (int i = 0; i < n; ++i)
            System.out.print("*");
        System.out.println("");
    }
}
