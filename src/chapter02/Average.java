/*
 Calcula média aritmética simples
 Author: Philippe
*/

import java.util.Scanner;

public class Average 
{
	public static void main(String[] args) 
	{
		var scan = new Scanner(System.in);

		System.out.print("| enter a sequence of integers: ");
		String[] snums = scan.nextLine().split(" ");

		double average = 0;
		for (int i = 0; i < snums.length; ++i)
			average += Integer.parseInt(snums[i]);

		average /= snums.length;
		System.out.printf("| the average is %.2f!", average);
	}
}