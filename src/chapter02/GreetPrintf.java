/*
 Programa em java que lê nome e dá boas vindas com printf
 Author: Philippe Matias
*/

import java.util.Scanner;

public class GreetPrintf
{
	public static void main(String[] args)
	{
		var scan = new Scanner(System.in);

		System.out.print("** enter your name: ");
		var name = scan.nextLine();

		System.out.printf("** hello and be welcome %s!", name);
	}
}