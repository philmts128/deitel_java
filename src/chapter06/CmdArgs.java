/**
* Author: Phil
*/


import java.util.Scanner;


public class CmdArgs
{
    public static void main(String[] args)
    {
        if (args.length < 1) {
            System.out.println("** invalid entry");
            return;
        }

        try {
            int[] nums = new int[args.length];
            for (int i = 0; i < args.length; ++i)
                nums[i] = Integer.parseInt(args[i]);

            System.out.println("** average: " + CmdArgs.avg(nums));
        } catch (Exception ex) {
            System.out.println("** invalid entry");
            return;
        }
    }

    public static double avg(int[] nums)
    {
        double sum = 0;
        for (int i : nums) sum += (double)i;
        return sum/nums.length;
    }
}
