/**
 * Test of java exception handling
 * Author: Phil Matias
 */
 
import java.util.Scanner;
import java.util.Arrays;


public class ExceptionHandle
{
	public static void main(String[] args)
	{
		var in = new Scanner(System.in);

		try
		{
			System.out.print("| enter a sequence of integers: ");
			String[] snums = in.nextLine().trim().split(" ");

			int[] nums = new int[snums.length];
			int sum = 0;

			for (int i = 0; i < snums.length; ++i) {
				nums[i] = Integer.parseInt(snums[i]);
				sum += nums[i];
			}

			Arrays.sort(nums);
			double average = (double)sum / nums.length;

			System.out.printf("| sum: %d\n", sum);
			System.out.printf("| average: %.2f\n", average);
		}
		catch (Exception ex)
		{
			System.out.println("| invalid input!");
		}
	}
}