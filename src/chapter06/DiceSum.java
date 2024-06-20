/**
 * Simulate the probability of sum of multiple dice values
 * Author: Philippe Matias
 */

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;


public class DiceSum
{
	public static void main(String[] args)
	{
		final int SIDES = 6;
		var rnd = new SecureRandom();

		System.out.print("** enter how many dice: ");
		int dice = new Scanner(System.in).nextInt();

		System.out.print("** enter how many iterations: ");
		int it = new Scanner(System.in).nextInt();

		var freq = new int[(SIDES * dice) + 1];
		for (int i = 0; i < it; ++i)
		 {
			int sum = 0;
			for (int k = 0; k < dice; ++k) 
				sum += rnd.nextInt(SIDES)+1;
			freq[sum] += 1;
		}

		double total = 0;
		for (int i : freq)
			total += i;

		System.out.println("\nSummation\tFrequency\tProbability");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < freq.length; ++i)
		{
			if (freq[i] != 0) {
				double pc = ((double)freq[i] / total) * 100.0;
				System.out.printf("%d\t\t%d\t\t%.2f%%\n", i, freq[i], pc);
			}
		}
	}
}