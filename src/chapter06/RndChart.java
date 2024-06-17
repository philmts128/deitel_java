/**
* Generate random array and display chart
* Author: Phil
*/


import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;


public class RndChart
{
    /*--------------------------------------*/
    public static void main(String[] args)
    {
        var input = new Scanner(System.in);

        System.out.print("** enter the amount of integers: ");
        int amount = input.nextInt();

        RndChart.output(RndChart.generateArray(amount));
    }

    /*--------------------------------------*/
    private static void output(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            System.out.printf("%2d - ", arr[i]);

            for (int k = 0; k < arr[i]; ++k)
                System.out.print("*");

            System.out.println("");
        }
    }

    /*--------------------------------------*/
    private static int[] generateArray(int amount)
    {
        var rnd = new SecureRandom();

        int[] nums = new int[amount];

        for (int i = 0; i < amount; ++i) {
            while (true) {
                int n = rnd.nextInt(20+1); //0 até 20
                if (RndChart.exists(nums, n)) continue;
                nums[i] = n;
                break;
            }
        }

        Arrays.sort(nums);
        return nums;
    }

    /*--------------------------------------*/
    private static boolean exists(int[] arr, int n)
    {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}
