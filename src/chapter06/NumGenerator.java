/**
* Generate random numbers
* Author: Phil
*/


import java.util.Scanner;
import java.security.SecureRandom;


public class NumGenerator
{
    public static void main(String[] args)
    {
        var input = new Scanner(System.in);
        var rnd = new SecureRandom();

        System.out.print("** enter the min. value in the range: ");
        int min = input.nextInt();

        System.out.print("** enter the max. value in the range: ");
        int max = input.nextInt();

        System.out.print("** enter how much  integers: ");
        int size = input.nextInt();

        var nums = new int[size];
        for (int i = 0; i < size; ++i)
            nums[i] = rnd.nextInt((max+1)-min) + min;

        System.out.print("** output: ");
        for (int i : nums)
            System.out.printf("%d ", i);
    }
}
