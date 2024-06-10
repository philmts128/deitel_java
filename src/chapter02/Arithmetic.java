/*
 Author: Philippe Matias
*/

import java.util.Scanner;

public class Arithmetic
{
	public static void main(String[] args)
	{
		var scan = new Scanner(System.in);

		System.out.print("| enter a integer: ");
		int n1 = scan.nextInt();

		System.out.print("| enter another integer: ");
		int n2 = scan.nextInt();

		int   sum = n1 + n2;
		int   sub = n1 - n2;
		int   mul = n1 * n2;
		float div = n1 / n2;

		System.out.printf("%d + %d = %d\n",   n1, n2,  sum);
		System.out.printf("%d - %d = %d\n",   n1, n2,  sub);
		System.out.printf("%d x %d = %d\n",   n1, n2,  mul);
		System.out.printf("%d / %d = %.2f\n", n1, n2,  div);
	}
}